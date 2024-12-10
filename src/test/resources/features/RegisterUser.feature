Feature: Register User

  Scenario: Register new user
    Given User navigates to the "baseUrl" page
    Then User verifies "SignupLogin" button is visible
    When User clicks on "SignupLogin" button
    Then User verifies "New User Signup!" text is visible
    When User enters name "Test User1234" and email "testuser@examp123.com"
    And User clicks on Signup button
    And User verifies that "ENTER ACCOUNT INFORMATION" text is visible
    When User fills out account information
    Then User clicks on Create Button button
    And User verifies that ACCOUNT CREATED! text is visible
    And User clicks on Continue button
    And User verifies that Logged in as username is visible