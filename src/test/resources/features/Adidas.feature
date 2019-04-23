# Login feature review the behavior in thie feature
Feature: Adidas

  Scenario: Home page is displayed adidas page
    Given 'Adidas' page is loaded
    And hover on menu 'hombre'
    And click on subMenu 'futbol'
    And get price from 'Calzado de Fútbol X 18.3 TF'
    And click on 'Calzado de Fútbol X 18.3 TF'
    And click on 'Elige talla'
    And click on 'Añadir al carrito'
    Then Verificar cantidad is "Cantidad: 1"
    And click on 'Ver carrito'
    Then Verificar Titulo is "CALZADO DE FÚTBOL X 18.3 TF"
    Then Verificar Price should be "$1,329.00"
    Then Verificar Total should be "$1,428.00"
