Feature: To check the saucedemo page

  Scenario Outline: Check the Login page for both positive and negative cases
    When Browser Configuration
    Then Check the "<username>" and "<password>"
    And To check whether the page login or not 

    Examples: 
      | username                | password     |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | ashwathaman             | secret_sauce |
      | standard_user           | secret_sauce |

  Scenario Outline: Check the prodect list page
    When login the browser "<username>" and "<password>"
    Then Check the product list in the "<ProductName>"
    And Check the product added in the card

    Examples: 
      | username     | password     | ProductName                       |
      | problem_user | secret_sauce | Test.allTheThings() T-Shirt (Red) |
      
