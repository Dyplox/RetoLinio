package co.com.linio.reto.tasks;

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

    public AgregarAlCarroEl(Producto producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(   // concatenar producto
                Click.on(SELECCIONAR_PRODUCTO),
                Click.on(ANADIR_CARRITO)
        );

        actor.remember(MENSAJE_INFO_PRODUCTO_POPUP, Text.of(MENSAJE_CARRO).viewedBy(actor).asString());

        actor.attemptsTo(
                Check.whether(
                        ValidarExistencia.producto(actor.recall(MENSAJE_INFO_PRODUCTO_POPUP)))
                        .andIfSo(
                                ObtenerInfo.delProducto(producto)
                        ),
                Click.on(CERRAR_POPUP)
        );
    }

    public static AgregarAlCarroEl producto(Producto producto) {
        return instrumented(AgregarAlCarroEl.class, producto);
    }
}