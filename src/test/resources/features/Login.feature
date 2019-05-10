
Feature: Login

  Scenario:      Home page is displayed once set Credential in Login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      | username             | password  |
      | admin@phptravels.com | demoadmin |


     #Menu Hotel
      #Sub Menu Room

        #Add Room
  Scenario Outline: Add Rooms
    Given 'PHP travel Menu Rooms' page is loaded
    And Click en Menu 'Hotels' en pagina home
    And Click en SubMenu 'Rooms' en pagina Hotels
    And Click en 'ADD' en pagina Rooms
    And Select Status "<status>" en formulario add Rooms
    And Select Room Type "<roomtype>" en formulario add Rooms
    And Select Hotel "<hotel>" en formulario add Rooms
    And Insert precio "<price>" en formulario add Rooms
    And Insert cantidad "<quantity>" en formulario add Rooms
    And Insert Minimum Stay "<minimumstay>" en formulario add Rooms
    And Insert Max Adults "<maxadults>" en formulario add Rooms
    And Insert Max Children "<maxchildren>" en formulario add Rooms
    And Insert Num of Extra Beds "<numextrabeds>" en formulario add Rooms
    And Insert Extra Bed Charges "<extrabedcharges>" en formulario add Rooms
    And Click 'SUBMIT' en formulario add Rooms
    Examples:
      | status  | roomtype     | hotel                | price | quantity | minimumstay | maxadults | maxchildren | numextrabeds | extrabedcharges |
      | Enabled | Triple Rooms | Alzer Hotel Istanbul | 1000  | 10       | 2           | 3         | 2           | 3            | 2               |

          #Edit Room
  Scenario Outline: Edit Rooms
    Given 'PHP travel Menu Rooms' page is loaded
    And Click en Menu 'Hotels' en pagina home
    And Click en SubMenu 'Rooms' en pagina Hotels
    And Click en 'EDIT' en pagina Rooms
    And Select Status "<status>" en formulario add Rooms
    And Select Room Type "<roomtype>" en formulario add Rooms
    And Select Hotel "<hotel>" en formulario add Rooms
    And Insert precio "<price>" en formulario add Rooms
    And Insert cantidad "<quantity>" en formulario add Rooms
    And Insert Minimum Stay "<minimumstay>" en formulario add Rooms
    And Insert Max Adults "<maxadults>" en formulario add Rooms
    And Insert Max Children "<maxchildren>" en formulario add Rooms
    And Insert Num of Extra Beds "<numextrabeds>" en formulario add Rooms
    And Insert Extra Bed Charges "<extrabedcharges>" en formulario add Rooms
    And Click 'SUBMIT' en formulario edit Rooms
    Examples:
      | status   | roomtype        | hotel                  | price | quantity | minimumstay | maxadults | maxchildren | numextrabeds | extrabedcharges |
      | Disabled | Superior Double | Grand Plaza Apartments | 3000  | 5        | 5           | 4         | 1           | 4            | 4               |

          #Delete Room
  Scenario Outline: Eliminar Rooms
    Given 'PHP travel Menu Rooms' page is loaded
    And Click en Menu 'Hotels' en pagina home
    And Click en SubMenu 'Rooms' en pagina Hotels
    And Click en 'SEARCH' en pagina Rooms
    And Insert air search "<search>" en pagina Rooms
    And Click en 'GO' en pagina Rooms
    And Click 'Delete' en pagina Rooms
    And Click 'Acept' en alert en pagina Rooms
    Examples:
      | search       |
      | Triple Rooms |

      #Menu Flight
        #Sub Menu Airports

          #Add Airports
  Scenario Outline: Add Airports
    Given 'PHP travel Menu Airports' page is loaded
    And Click en Menu 'Flight' en pagina home
    And Click en SubMenu 'Airports' en pagina Flight
    And Click en 'ADD' en pagina Airports
    And Insert codigo "<code>" en formulario add Airports
    And Insert nombre "<name>" en formulario add Airports
    And Insert codigo ciudad "<citycode>" en formulario add Airports
    And Insert nombre ciudad "<cityname>" en formulario add Airports
    And Insert nombre pais "<countryname>" en formulario add Airports
    And Insert codigo pais "<countrycode>" en formulario add Airports
    And Insert zona horaria "<timezone>" en formulario add Airports
    And Insert latitud "<lat>" en formulario add Airports
    And Insert longitud "<log>" en formulario add Airports
    And Insert ciudad "<city>" en formulario add Airports
    And Click 'SAVE & RETURN' en formulario add Airports
    Examples:
      | code | name          | citycode | cityname      | countryname | countrycode | timezone | lat    | log   | city |
      | MAU  | Mauricio Arpt | CMG      | Mauricio City | MC          | MMM         | -4       | -3.456 | 4.876 | true |

         #Edit Airports
  Scenario Outline: Edit Airports
    Given 'PHP travel Menu Airports' page is loaded
    And Click en Menu 'Flight' en pagina home
    And Click en SubMenu 'Airports' en pagina Flight
    And Click en 'SEARCH' en pagina Airports
    And Insert air search "<search>" en pagina Airports
    And Click en 'GO' en pagina Airports
    And Click en 'EDIT' en pagina Airports
    And Insert codigo "<code>" en formulario add Airports
    And Insert nombre "<name>" en formulario add Airports
    And Insert codigo ciudad "<citycode>" en formulario add Airports
    And Insert nombre ciudad "<cityname>" en formulario add Airports
    And Insert nombre pais "<countryname>" en formulario add Airports
    And Insert codigo pais "<countrycode>" en formulario add Airports
    And Insert zona horaria "<timezone>" en formulario add Airports
    And Insert latitud "<lat>" en formulario add Airports
    And Insert longitud "<log>" en formulario add Airports
    And Insert ciudad "<city>" en formulario add Airports
    And Click 'SAVE & RETURN' en formulario edit Airports
    And Click 'RESET' en pagina Airports
    Examples:
      | search   | code | name        | citycode | cityname    | countryname | countrycode | timezone | lat     | log    | city  |
      | SPAIN  | CAR  | Carlos Arpt | CMG      | Carlos City | CG          | CCC         | -2       | -30.456 | 40.876 | false |

       #Delete Airports
  Scenario Outline: Delete Airports
    Given 'PHP travel Menu Airports' page is loaded
    And Click en Menu 'Flight' en pagina home
    And Click en SubMenu 'Airports' en pagina Flight
    And Click en 'SEARCH' en pagina Airports
    And Insert air search "<search>" en pagina Airports
    And Click en 'GO' en pagina Airports
    And Click en 'Delete' en pagina Airports
    And Click 'Acept' en alert en pagina Airports
    Examples:
      | search      |
      | Carlos Arpt |



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
      | car_name        |
      | The Knowns Cars |


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
      | category_Name  | status | name_Spanish   |
      | Traels Ejemplo | Enable | Viajes ejemplo |

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
      | status  | offer_Title   | phone  | email          | offer_Price | from       | to         | offer_Description       |
      | Enabled | OfertaEjemplo | 123456 | ejeOff@php.com | 100         | 01/05/2019 | 01/06/2019 | es un ejemplo de oferta |

  Scenario Outline: Offers Settings
    Given 'PHP travels section Offers' page is loaded
    And Click in Menu 'OFFERS' in home menu
    And Click in Sub Menu 'OFFERS SETTINGS' in home sub menu
    And Insert Target "<Target>" in form Offer Setiing
    And Insert Page Title "<Page_Title>" in form Offer Setiing
    And Insert Listings Page "<Listings_Page>" in form Offer Setiing
    And Click 'SUBMIT' in for Offers Setting
    Examples:
      | Target | Page_Title    | Listings_Page |
      | Self   | Offers Prueba | 5             |
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
      | status | percentaje | Max_uses |
      | Enable | 50         | 2        |

  #NEWSLETTERS
  Scenario Outline: Send NewsLetters
    Given 'PHP travels secction NewsLetters' page is loaded
    And Click in menu 'NEWSLETTERS' in home page
    And Click Button 'SEND NEWSLETTERS' in form news letters
    #And Select "<Send_To>" in form send newsletters
    And Insert "<Subject>" in form
    #And click Button 'SEND' in form
    Examples:
      | Send_To   | Subject |
      | Customers | tema    |
   # BOOKINGS
  Scenario Outline: Edidt Bookings
    Given 'PHP travels secction Bookings' page is loaded
    And Click in menu 'BOOKINGS' in home page
    And Click button 'EDIT' in Booking page
    And Select "<Booking_Status>" in form Bookings
    And button 'UPDATE BOOKING' in form
    Examples:
      | Booking_Status |
      | Cancelled      |

  Scenario: probar boton website en el dashboard
    Given press button DASHBOAR page main dashboard
    And press button website page main dashboard
    And press button quickbook page main dashboard
    And press button bookings page main dashboard
    And press button cmsPages page main dashboard
    And press button blog page main dashboard
    And press button newsletter page main dashboard
    And press button backup page main dashboard

  Scenario Outline: create new user admin
    Given mostrar page admins management
    And press button new username page admins management
    And insert "<firsname>" firstname page form user
    And insert "<lastname>" lastname page form user
    And insert "<email>" email page form user
    And insert "<password>" password page form user
    And insert "<mobileNumber>" mobile number page form user
    And select Bolivia country page form user
    And insert "<addres1>" addres1 page form user
    And click button subscriber page form user
    And press check box hotels page form user
    And press check tours page form user
    Then press button submit
    Examples:
      | firsname | lastname | email             | password | mobileNumber | addres1                |
      | Arebalo  | Lopez    | arebalo@gmail.com | 123456   | 71039562     | Av. Geronimo de osorio |


  Scenario Outline: modify user admin
    Given mostrar page admins management
    And press button edit page admins management
    And insert "<firsname>" firstname page form user
    And insert "<lastname>" lastname page form user
    Then press button submit
    Examples:
      | firsname | lastname         |
      | Rudolf   | Felipez Mancilla |

  Scenario: delete user admin
    Given mostrar page admins management
    And press button delete page admins management
    Then press button acept popus dialog

#  Scenario: disabled module 'HOTELS'
#    Given press button modules
#    And press button DISABLED HOTELS
#    Then acept the confirm disable module

  Scenario: disabled module 'BLOG'
    Given press button modules
    And press button DISABLED BLOG
    Then acept the confirm disable module

  Scenario: enabled module 'HOTELS'
    Given press button modules
    And press button ENABLED HOTELS
    Then acept the confirm disable module

  Scenario: enabled module 'BLOG'
    Given press button modules
    And press button ENABLED BLOG
    Then acept the confirm disable module

  Scenario: verify page settings module 'BLOG'
    Given press button modules
    And press button settings 'BLOG'
    Then press button modules

  Scenario: verify button up order module 'BLOG'
    Given press button modules
    And press button button order up

      #Menu Module

           # Enabled/Disabled Module
  Scenario: Enabled/Disabled Module
    Given 'PHP travel Menu Module' page is loaded
    And click en Menu 'Module' en pagina home
    And click en 'Enabled/Disabled module' en pagina module
    And click en 'Enabled/Disabled' en alert




