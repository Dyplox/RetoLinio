package co.com.linio.reto.questions;

import co.com.linio.reto.models.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validar implements Question<Boolean> {

    Producto producto;

    @Override
    public Boolean answeredBy(Actor actor) {
        if (producto.equals(null)){

        }
        return null;
    }

    public static Validar carro() {
        return new Validar();
    }
}