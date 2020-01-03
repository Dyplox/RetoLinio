package co.com.linio.reto.tasks;

import co.com.linio.reto.interactions.Esperar;
import co.com.linio.reto.interactions.LLamarInfo;
import co.com.linio.reto.models.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerInfo implements Task {

    private Producto producto;

    public ObtenerInfo(Producto producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LLamarInfo.deLaPagina(producto));
    }

    public static ObtenerInfo delProducto(Producto producto) {
        return instrumented(ObtenerInfo.class, producto);
    }
}