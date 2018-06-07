# language : es
Característica: Agregar productos al carrito de compras
  Yo como comprador quiero tener la posibilidad de agregar productos al carrito de compras
  para llevar el control de los posibles productos a comprar

  @tag1
  Esquema del escenario: : Cesar desea agregar articulos al carro de compras para llevar el control de los productos que desea
    Dado que Cesar <usuario> <password> quiere agregar a su carrito productos
    Cuando el agrega un <producto> al carrito de compras
    Entonces se debe visualizar el producto en el detalle del carrito de compras

    Ejemplos: 
      | usuario    | password | producto |
      | jrperez175 | lj120501 | iPhone 5 |
