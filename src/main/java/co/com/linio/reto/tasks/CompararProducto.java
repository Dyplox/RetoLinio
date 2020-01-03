package co.com.linio.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompararProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static CompararProducto enCarroCompras() {
        return instrumented(CompararProducto.class);
    }
}