Feature: Citizenship Function

  Background:
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button
    And Navigate to Citizenship page

  Scenario Outline: Create a Citizenship
    And Click on add Button
    And Enter "<CitizenShipName>" and "<CitizenshipShortName>"
    When Click on save button
    Then Success message should be displayed
    Examples:
      | CitizenShipName | CitizenshipShortName |
      | Batch 9 1       | BT91                 |
      | Batch 9 2       | BT92                 |
      | Batch 9 3       | BT93                 |

#    Create a scenario outline to delete the citizenships that we have created
  Scenario Outline: Delete Citizenship
    And Search for "<CitizenShipName>" as citizenship name
    And Click on delete button
    When Click on delete confirm button
    Then Success message should be displayed
    Examples:
      | CitizenShipName |
      | Batch 9 1       |
      | Batch 9 2       |
      | Batch 9 3       |