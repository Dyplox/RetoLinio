package co.com.linio.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.linio.reto.utils.Constantes.MENSAJE_PRODUCTO_AGREGADO;

public class ValidarExistencia implements Question<Boolean> {

    private String mensaje;

    public ValidarExistencia(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return mensaje.contains(MENSAJE_PRODUCTO_AGREGADO);
    }

    public static ValidarExistencia producto(String mensaje){
        return new ValidarExistencia(mensaje);
    }
}