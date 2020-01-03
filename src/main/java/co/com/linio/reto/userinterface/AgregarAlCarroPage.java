package co.com.linio.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarAlCarroPage {

    public static final Target SELECCIONAR_PRODUCTO = Target.the("Seleccionar producto a buscar")
            .locatedBy("//*[contains(@id, 'catalogue-product-container')]//*[contains(text(), '{0}')]");

    public static final Target ANADIR_CARRITO = Target.the("btn añadir al carrito")
            .locatedBy("//button[contains(@id, 'buy-now')]");

    public static final Target CERRAR_POPUP = Target.the("Cerrar alert")
            .locatedBy("//*[contains(@class, 'icon header-icon-close')]");

    public static final Target MENSAJE_CARRO = Target.the("Mensaje PopUp")
            .locatedBy("//span[contains(text(), 'Tu producto se agreg')]");
    //.locatedBy("//span[contains(text(), 'Tu producto se agregó al carrito')]");
}