package co.com.linio.reto.tasks;

import co.com.linio.reto.interactions.Esperar;
import co.com.linio.reto.models.Producto;
import co.com.linio.reto.questions.ValidarExistencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.linio.reto.userinterface.AgregarAlCarroPage.*;
import static co.com.linio.reto.utils.Constantes.MENSAJE_INFO_PRODUCTO_POPUP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarroEl implements Task {

    Producto producto;
    private String nombreProducto;

    public AgregarAlCarroEl(String nombreProducto, Producto producto) {
        this.nombreProducto = nombreProducto;
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SELECCIONAR_PRODUCTO.of(nombreProducto + "")),
                Click.on(ANADIR_CARRITO)
        );

        actor.remember(MENSAJE_INFO_PRODUCTO_POPUP, Text.of(MENSAJE_CARRO).viewedBy(actor).asString());
        ValidarExistencia.producto(actor.recall(MENSAJE_INFO_PRODUCTO_POPUP));

        actor.attemptsTo(
                ObtenerInfo.delProducto(producto),
                Click.on(CERRAR_POPUP)
        );
    }

    public static AgregarAlCarroEl producto(String nombreProducto, Producto producto) {
        return instrumented(AgregarAlCarroEl.class, nombreProducto, producto);
    }
}