Feature: States Function Database Test

  Scenario: Check if the data is correct
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to States page
    When Send "Select name from states limit 10" as query
    Then Check if the results match with the UI