# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  Scenario: probar boton website en el dashboard
    Given the 'PHP travel' page is loaded correctly
#    And press button website
#    And press button quickbook
#    And press button bookings
#    And press button cmsPages
#    And press button blog
#    And press button newsletter
#    And press button backup

#  Scenario: create new user admin
#    Given mostrar page admins management
#    And press button new username
#    And insert "Arevalo" firstname
#    And insert "Lopez" lastname
#    And insert "arevalo@gmail.com" email
#    And insert "123456" password
#    And insert "71039562" mobile number
#    And select Bolivia country
#    And insert "AV. Geronimo de osorio" addres 1
##    And insert "Enabled" status
#    And click button subscriber
#    And press check box hotels
#    And press check tours
#    Then press button submit

  Scenario: modify user admin
    Given mostrar page admins management
    And press button edit
    And insert "rudolf" firstname
    And insert "felipez mancilla" lastname
    Then press button submit

  Scenario: delete user admin
    Given mostrar page admins management
    And press button delete
    Then press button acept popus dialog

