Feature: Data Table Example

  Scenario: Data Table with 1 column
    Given Go to the Web Page
    And Fill the form with valid data
      | John             |
      | Snow             |
      | 6521 Spring Ave. |
      | 6321548965       |
    Then Save the form

  Scenario: Data Table With Multiple Columns
    Given Go to the Web Page
    And Enter valid data
      | Name      | John             |
      | Last Name | Snow             |
      | Address   | 6521 Spring Ave. |
      | Phone     | 6321548965       |
    Then Save the form

    #Scenario outline runs the entire scenario for each set of data
    #Data table sends the entire data to only one step at once and we can use
    #the data on one step
