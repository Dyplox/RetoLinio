# language: es
# author: @AbelGuAr
# encoding: utf-8

@CarritoLinio
Característica: Proceso para realizar una compra en Linio

  Esquema del escenario: scenario: Crear una solicitud de compra en la página  web de Linio
    Dado que Abel quiere ingresar a Linio
    Cuando selecciona el producto deseado <producto> lo agrega al carro de compra
    Entonces se valida que fue agregado exitosamente en al carro de compra
    Ejemplos:
      | producto                      |
      | Scooter Eléctrico Xiaomi M365 |
      | Game of Thrones               |
      | Drácula                       |
      | Zapatillas Adidas             |
      | Xiaomi Mi 9T PRO 128GB        |
      | Sillas Gamer                  |
      | Reloj Pared                   |