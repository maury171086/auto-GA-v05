
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


           #Menu Module

           # Enabled/Disabled Module
  Scenario: Enabled/Disabled Module
    Given 'PHP travel Menu Module' page is loaded
    And click en Menu 'Module' en pagina home
    And click en 'Enabled/Disabled module' en pagina module
    And click en 'Enabled/Disabled' en alert

