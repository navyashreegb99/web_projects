Feature: LoginFeature
  This feature deals with login functionality of Application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter username as admin and password as admin
    And I click login button
    Then I should see the uniform page
