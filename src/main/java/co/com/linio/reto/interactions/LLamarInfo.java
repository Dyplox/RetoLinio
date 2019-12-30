package co.com.linio.reto.interactions;

import co.com.linio.reto.models.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.linio.reto.userinterface.CarroCompraPage.NOMBRE_PRODUCTO;
import static co.com.linio.reto.userinterface.CarroCompraPage.VALOR_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LLamarInfo implements Interaction {

    private Producto producto;

    public LLamarInfo(Producto producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (Visibility.of(NOMBRE_PRODUCTO).viewedBy(actor).asBoolean()) {
            producto.setNombreProducto(Text.of(NOMBRE_PRODUCTO).viewedBy(actor).asString());
            producto.setValorProducto(Text.of(VALOR_PRODUCTO).viewedBy(actor).asString());
        }
    }

    public static LLamarInfo deLaPagina(Producto producto) {
        return instrumented(LLamarInfo.class, producto);
    }
}