Feature: Country Function
  As a user I want to be able to create, update and delete different countries
  so I can add students from different countries

  Background: Runs before each scenario on this feature file
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Country page

  Scenario: Create a new Country
#    Given Navigate to Campus Web Site
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Country page
    And Click on add Button
    And Enter country name and country code
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete Country
#    Given Navigate to Campus Web Site
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Country page
    And Search for the name of the country
    And Click on delete button
    When Click on delete confirm button
    Then Success message should be displayed

  Scenario: Create country with parameters
    And Click on add Button
    And Enter "Batch 9" as country name and "BT9" as country code
    When Click on save button
    Then Success message should be displayed

#    Create delete country scenario with parameters
  Scenario: Delete country with parameters
    And Search for "Batch 9" as country name
    And Click on delete button
    When Click on delete confirm button
    Then Success message should be displayed
