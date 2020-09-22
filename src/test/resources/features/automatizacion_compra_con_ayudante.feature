Feature: yo como usuario quiero ingresar al sitio web https://www.homecenter.com.co/homecenter-co/
  y diligenciar todo para agregar un producto al carrito de compras


  @caso1
  Scenario: Ingresar al sitio web de home center y agregar vitriflex semimate al carro de compras
    Given ingreso al sitio web
    When  ingresar al ayudante y agregar un producto al carrito de compras
    |pregunta  |tipo     |
    |pintar    |Pinturas |
    Then  Verificar el producto en el carrito "¡Excelente! Tu producto ya está en el carro."
