Feature: SauceDemo Login Functionality

  Scenario: Login with empty credentials
    When User clicks the Login button without entering any credentials
    Then User see an error message "Username is required" displayed

  Scenario: Login without password
    When User enter a valid username "standard_user" and leaves the password empty
    And User click the Login button
    Then User see an error message "Password is required" displayed

  Scenario Outline: Login with valid credentials
    When User enter with username "<username>" and password "<password>"
    And User click the Login button
    Then User should be redirected to the Products page
    And the page title should be "Swag Labs"

    Examples:
      | username       | password     |
      | standard_user  | secret_sauce |
      | problem_user   | secret_sauce |
      | performance_glitch_user | secret_sauce |

