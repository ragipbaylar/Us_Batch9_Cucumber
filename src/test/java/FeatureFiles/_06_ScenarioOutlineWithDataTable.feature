Feature: Scenario Outline with Data Table

  Scenario Outline: Scenario 1
    Given Step one
      | Step1 | <Round Value 1> |
    When Step two
    And Step three
      | Step3 | <Round Value 2> |
    Then Step four
    Examples:
      | Round Value 1   | Round Value 2   |
      | Round 1 Value 1 | Round 1 Value 2 |
      | Round 2 Value 1 | Round 2 Value 2 |
      | Round 3 Value 1 | Round 3 Value 2 |
      | Round 4 Value 1 | Round 4 Value 2 |


#  output
#
#  Step 1 Round 1 Value 1  Step 3 Round 1 Value 2
#  Step 1 Round 2 Value 1  Step 3 Round 2 Value 2
#  Step 1 Round 3 Value 1  Step 3 Round 3 Value 2
#  Step 1 Round 4 Value 1  Step 3 Round 4 Value 2


