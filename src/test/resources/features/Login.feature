# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

  # menu Cars
  Scenario: cars page
    Given pagina 'php travels' cargar
    And click Sub Menu 'CARS' in home menu
    And click 'Cars' in home sub menu
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

  # menu Blog
  Scenario Outline: Posts page
    Given 'PHP travels section Blog' page is loaded
    And Click Menu 'BLOG' in home menu
    And Click Sub Menu 'POSTS' in home Sub Menu
    And Click button 'ADD' in page Blog
    And Insert imput Post Title "<post_Title>" in form Add Posts
    #And Insert imput Area Text "<text_Area>" in form Text
    And Select "<status>" in form posts
    And Select "<category>" in form
    And Click Button 'SUBMIT' in form posts add
    Examples:
    |post_Title   |text_Area                     |status|category|
    |Posts Ejemplo|este es un ejemplo de Posts   |Enable|Adventure|

  Scenario Outline: Blog Categories
    Given 'PHP travels section Blog' page is loaded
    And Click Menu 'BLOG' in home menu
    And Click Sub Menu 'BLOG CATEGORIES' in home Sub Menu
    And Click button 'ADD' in form Blog Categories
    And Insert imput Category Name "<category_Name>" in form
    And Select "<status>" in form Blog Cateories
    And Insert imput Name in Spanish "<name_Spanish>" in form
    And Click Button 'ADD' in form
    Examples:
    |category_Name |status|name_Spanish  |
    |Traels Ejemplo|Enable|Viajes ejemplo|

  # menu offers
  Scenario Outline: Offers Manage Page
    Given 'PHP travel section Manage Offers' page is loaded
    And Click en el Menu 'OFFERS MANAGE' in home menu
    And Click en el Sub Menu 'Manage Offers' in home menu
    And Click Button 'ADD' in page offers manage
    And Select "<status>" in form offers manager Add
    And Insert input Title "<offer_Title>" in form offers manager Add
    And Insert input Phone "<phone>" in form offers manager Add
    And Insert input Email "<email>" in form offers manager Add
    And Insert input Price "<offer_Price>" in form offers manager Add
    And Data Time From "<from>" in form offers manager Add
    And Data Time To "<to>" in form offers manager Add
    And Insert TextArea "<offer_Description>" in form offers manager Add
    And Click Button 'SUBMIT' in form offers manager Add
    Examples:
      |status|offer_Title|   phone |email          |offer_Price|from       |to         |offer_Description|
      |Enabled|OfertaEjemplo|123456|ejeOff@php.com |100        |01/05/2019 |01/06/2019 |es un ejemplo de oferta|

Scenario Outline: Offers Settings
  Given 'PHP travels section Offers' page is loaded
  And Click in Menu 'OFFERS' in home menu
  And Click in Sub Menu 'OFFERS SETTINGS' in home sub menu
  And Insert Target "<Target>" in form Offer Setiing
  And Insert Page Title "<Page_Title>" in form Offer Setiing
  And Insert Listings Page "<Listings_Page>" in form Offer Setiing
  And Click 'SUBMIT' in for Offers Setting
  Examples:
    |Target |Page_Title     |Listings_Page|
    |Self  |Offers Prueba |5           |




