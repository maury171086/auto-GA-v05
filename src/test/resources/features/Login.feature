# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

  # menu Cars
  Scenario Outline: Add cars on Cars
    Given pagina 'php travels section Cars' page is load
    And click Sub Menu 'CARS' in home
    And click 'Cars' on home sub menu
    And click 'ADD' boton list
    And Insert "<car_name>" on form cars
    #And insert "ABC DESCRIPTION" on text field
    And click Button 'SUBMIT' boton
    Examples:
    |car_name       |
    |The Knowns Cars|


  Scenario: Delete Cars on Cars
    Given 'PHP travels section Cars' page is loaded
    And Click menu 'CARS' in home page
    And Click sub menu 'Cars' in home sub menu
    And Click button 'DELETE' in form Cars

  Scenario: Edidt Cars on Cars
    Given 'PHP travels sections Cars' page is loaded
    And Click in menu 'CARS' in home page
    And Click  'CARS' on sub menu
    And click 'EDIT' boton
    And Insert <"name_cars_edit"> on name cars form
    And click 'SUBMIT' boton edit

  # menu Blog
  Scenario: ADD Posts page
    Given 'PHP travels section Blog' page is loaded
    And Click Menu 'BLOG' in home menu
    #And Click Sub Menu 'POSTS' in home Sub Menu
    #And Click button 'ADD' in page Blog
    #And Insert imput Post Title "<post_Title>" in form Add Posts
    #And Insert imput Area Text "<text_Area>" in form Text
    #And Select "<status>" in form posts
    #And Select "<category>" in form
    #And Click Button 'SUBMIT' in form posts add
    #Examples:
    #|post_Title   |text_Area                     |status|category|
    #|Posts Ejemplo|este es un ejemplo de Posts   |Enable|Adventure|

  Scenario Outline: Add Blog Categories
    Given 'PHP travels section Blog' page is loaded
    And Click Menu 'BLOG' in home menu
    And Click Sub Menu 'BLOG CATEGORIES'
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
  # COUPONS
  Scenario Outline: Coupons Manage
    Given 'PHP travels section Coupons' page is loaded
    And Click in Menu 'COUPONS' in home menu
    And Click in button'ADD' in page Coupons Code Management
    And Select status "<status>" in form Add Coupon Code
    And Insert percentaje "<percentaje>" in Add form Coupon Code
    And Insert "<Max_uses>" in Add form Coupons Code
    And Click button 'Generate' code
    #And Click button 'SUBMIT' in form Add Coupons Code
    Examples:
    |status|percentaje|Max_uses|
    |Enable| 50       |   2    |

  #NEWSLETTERS
  Scenario Outline: Send NewsLetters
    Given 'PHP travels secction NewsLetters' page is loaded
    And Click in menu 'NEWSLETTERS' in home page
    And Click Button 'SEND NEWSLETTERS' in form news letters
    #And Select "<Send_To>" in form send newsletters
    And Insert "<Subject>" in form
    #And click Button 'SEND' in form
    Examples:
      |Send_To  |Subject|
      |Customers|tema   |
   # BOOKINGS
  Scenario Outline: Edidt Bookings
    Given 'PHP travels secction Bookings' page is loaded
    And Click in menu 'BOOKINGS' in home page
    And Click button 'EDIT' in Booking page
    And Select "<Booking_Status>" in form Bookings
    And button 'UPDATE BOOKING' in form
    Examples:
    |Booking_Status|
    |Cancelled     |







