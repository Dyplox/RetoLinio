package co.com.linio.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.linio.reto.userinterface.BuscarProductoPage.BUSCAR;
import static co.com.linio.reto.userinterface.BuscarProductoPage.TXT_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarEl implements Task {

    private String producto;

    public BuscarEl(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(TXT_PRODUCTO),
                Click.on(BUSCAR)
        );
    }

    public static BuscarEl producto(String producto) {
        return instrumented(BuscarEl.class, producto);
    }
}