Feature: Country Function
  As a user I want to be able to create different countries
  so I can add students from different countries

  Scenario: Create a new Country
    Given Navigate to Campus Web Site
    And Enter username and password
    And Navigate to Country page
    And Click on add Button
    And Enter country name and country code
    When Click on save button
    Then Success message should be displayed
