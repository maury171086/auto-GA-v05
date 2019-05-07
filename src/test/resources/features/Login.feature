# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      | username             | password  |
      | admin@phptravels.com | demoadmin |

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

