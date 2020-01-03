package co.com.linio.reto.tasks;

import co.com.linio.reto.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ir implements Task {

    private Target page;

    public Ir(Target page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(page)
        );
    }

    public static Ir A(Target page) {
        return instrumented(Ir.class, page);
    }
}