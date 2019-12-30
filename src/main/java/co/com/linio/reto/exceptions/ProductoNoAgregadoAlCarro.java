package co.com.linio.reto.exceptions;

public class ProductoNoAgregadoAlCarro extends AssertionError {
    public static final String EXCEPTION_CARRO_NO_AGREGADO = "¡El producto no pudo agregarse al carrito por falta de inventario!";

    public ProductoNoAgregadoAlCarro(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}