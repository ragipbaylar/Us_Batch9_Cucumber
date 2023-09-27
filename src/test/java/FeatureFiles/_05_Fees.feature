Feature: Fees Function

  Background:
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Fees Page

  @SmokeTest @FireTest
  Scenario: Add a Fee
    And Click on add Button
    And Fill the form
      | Batch 9 Fee |
      | BT9         |
      | BT9Fee      |
      | 754         |
    When Click on Save and Exit Button
    Then Success message should be displayed

    #Write a scenario to delete the fee you have created
  @SmokeTest @FireTest
  Scenario: Delete Fee
    And Search for the fee name
      | Batch 9 Fee |
      | BT9         |
      | 754         |
    And Click on delete button
    When Click on delete confirm button
    Then Success message should be displayed


