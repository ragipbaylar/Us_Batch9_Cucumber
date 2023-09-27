Feature: Entrance Exams Function

  Background:
    Given Navigate to Campus Web Site
    And Enter username and password
    And Click on Login Button

  Scenario Outline: Create an Entrance Exam
    And Navigate to Entrance Exams page
    And Click on add Button
    And Fill the Create Exam form
      | <Exam Name> |
    And Add a Description
      | <Description> |
    And Add a Note
      | <Note> |
    When Click on save button
    Then Success message should be displayed
    Examples:
      | Exam Name      | Description                        | Note                            |
      | Batch 9 Exam 1 | Batch 9 is the best                | We are coming soon              |
      | Batch 9 Exam 2 | Batch 9 rocks                      | Get prepared                    |
      | Batch 9 Exam 3 | Batch 9 is fun                     | We are having soo much fun      |
      | Batch 9 Exam 4 | Batch 9 don't give up              | We can do it                    |
      | Batch 9 Exam 5 | We are almost ready for the market | We will be better than everyone |

    # TODO: Create a scenario to delete all entrance exams the we have created