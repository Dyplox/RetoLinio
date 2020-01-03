package co.com.linio.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class BuscarProductoPage extends PageObject {

    public static final Target TXT_PRODUCTO = Target.the("Txt producto a buscar")
            .locatedBy("//*[contains(@class, 'search hidden-sm-down')]//*[contains(@type, 'search')]");

    public static final Target BUSCAR = Target.the("Btn buscar")
            .locatedBy("//*[contains(@class, 'btn btn-primary btn-search')]");

}
