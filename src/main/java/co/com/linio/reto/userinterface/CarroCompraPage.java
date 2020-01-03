package co.com.linio.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarroCompraPage {

    public static final Target IR_CARRO_COMPRAS = Target.the("Ir al carrito de compras")
            .locatedBy("//*[contains(@class, 'header-section-profile')]/a[contains(@href, '/cart')]");
    //.locatedBy("//*[contains(@class, 'header-section-profile col-lg-2 col-md-3 header-icons-row')]//a[contains(@href, '/cart')]");

    public static final Target NOMBRE_PRODUCTO = Target.the("nombre Producto en el PopUp carrito")
            .locatedBy("//*[contains(@class, 'product-name')]");

    public static final Target VALOR_PRODUCTO = Target.the("valor Producto en el PopUp carrito")
            .locatedBy("//*[contains(@class, 'row product-modal-info')]//*[contains(@class, 'lowest-price')]");


    //nuevos target carro de compras

    public static final Target NOMBRE_PRODUCTO_CARRO = Target.the("nombre Producto en el carrito")
            .locatedBy("//*[contains(@class, 'item-title')]/span");

    public static final Target VALOR_PRODUCTO_CARRO = Target.the("valor Producto en el carrito")
            .locatedBy("//*[contains(@class, 'price-main-sm pull-xs-right subtotal-price')]");
}