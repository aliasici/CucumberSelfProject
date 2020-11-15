Feature: Login functionality
  Scenario:As an user I want to be able to login under different roles
    Given open browser
    And user is on the login page
    When user logs in
    Then user should see dashboard page