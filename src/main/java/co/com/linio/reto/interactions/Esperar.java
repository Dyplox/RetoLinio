package co.com.linio.reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static co.com.linio.reto.utils.CondicionExitosa.paraElTiempo;


public class Esperar implements Interaction {

    private int segundos;

    public Esperar(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Awaitility.await().forever().pollInterval(segundos, TimeUnit.SECONDS).until(paraElTiempo());
    }

    /**
     * Método de Espera implicita genérico, espera cantidad de segundos fijos
     * <p>&nbsp;</p>
     * <pre>
     * Espera.unMomento(10).performAs(actor);
     * </pre>
     *
     * @param segundos Cantidad de segundos fijos a esperar
     */
    public static Esperar unMomento(int segundos) {
        return Tasks.instrumented(Esperar.class, segundos);
    }


}
