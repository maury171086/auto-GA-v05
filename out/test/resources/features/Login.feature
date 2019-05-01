# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'SisSecurity' page is loaded
    And set my credentials on 'Login' page


  Scenario: probar opcion Cars de la pagina phptravels
    Given pagina 'php travels' cargar
    And click 'ADD' boton
    And insert "ABC CARS" name cars
    #And insert "ABC DESCRIPTION" on text field
    And click 'SUBMIT' boton

  Scenario: eliminar Cars de la pagina
    And click 'DELETE' boton

  Scenario: editar Cars de la pagina
    And click 'EDIT' boton
    And insert "ABC CARS EDIT" name is cars
    And click 'SUBMIT' boton edit
