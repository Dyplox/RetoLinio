package co.com.linio.reto.stepdefinitions;

import co.com.linio.reto.interactions.Esperar;
import co.com.linio.reto.models.Producto;
import co.com.linio.reto.tasks.AbrirElNavegador;
import co.com.linio.reto.tasks.AgregarAlCarroEl;
import co.com.linio.reto.tasks.BuscarEl;
import co.com.linio.reto.tasks.Ir;
import co.com.linio.reto.userinterface.LinioHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.linio.reto.userinterface.CarroCompraPage.*;

public class ComprarLinioStepDefinitions {

    public Producto producto = new Producto();

    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor actor = Actor.named("Abel Fernando Gutiérrez Arias");
    private LinioHomePage linioPage;

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(herBrowser));
    }

    @Dado("^que Abel quiere ingresar a Linio$")
    public void queAbelQuiereIngresarALinio() {
        actor.wasAbleTo(AbrirElNavegador.enlaPaginaDeLinio(linioPage));
    }

    @Cuando("^selecciona el producto deseado (.*) lo agrega al carro de compra$")
    public void seleccionaElProductoDeseadoYLoAgregaAlCarroDeCompra(String nombreProducto) {
        actor.attemptsTo(
                BuscarEl.producto(nombreProducto),
                AgregarAlCarroEl.producto(nombreProducto, producto)
        );
    }

    @Entonces("^se valida que fue agregado exitosamente en al carro de compra$")
    public void seValidaQueFueAgregadoExitosamenteAlCarroDeCompra() {
        actor.attemptsTo(Ir.A(IR_CARRO_COMPRAS));

        actor.attemptsTo(
                Esperar.unMomento(1),
                // Ensure.that(producto.getNombreProducto()).isEqualTo(Text.of(NOMBRE_PRODUCTO_CARRO).viewedBy(actor).asString()),
                Ensure.that(producto.getNombreProducto().trim().toLowerCase()).contains(Text.of(NOMBRE_PRODUCTO_CARRO).viewedBy(actor).asString().toLowerCase()),
                //Ensure.that(producto.getValorProducto()).isEqualTo(Text.of(VALOR_PRODUCTO_CARRO).viewedBy(actor).asString()),
                Ensure.that(producto.getValorProducto().trim()).contains(Text.of(VALOR_PRODUCTO_CARRO).viewedBy(actor).asString())
        );
    }
}