Feature: Citizenship with Apache POI

  Background:
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Citizenship page

  Scenario: Create Citizenship by getting data from Excel
    Then Create a citizenship by using Apache POI