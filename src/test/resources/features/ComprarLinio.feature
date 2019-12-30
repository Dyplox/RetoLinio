# language: es
# author: @AbelGuAr
# encoding: utf-8

@CarritoLinio
Característica: Proceso para realizar una compra en Linio

  Escenario: Crear una solicitud
    Dado que Abel quiere ingresar a Linio
    Cuando selecciona el producto deseado Scooter Eléctrico Xiaomi M365 lo agrega al carro de compra
    Entonces se valida que fue agregado exitosamente en al carro de compra