package co.com.linio.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirElNavegador implements Task {

    private PageObject page;

	public AbrirElNavegador(PageObject page){
		this.page = page;
	}

	@Override
	@Step("{0} opens the browser on HomePage of Google")
	public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static AbrirElNavegador enlaPaginaDeLinio(PageObject page) {
        return instrumented(AbrirElNavegador.class, page);
    }
}