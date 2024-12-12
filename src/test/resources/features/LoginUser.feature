Feature: Login User

  Scenario: Login user with correct email and password
    Given User navigates to the "baseUrl" page
    Then User verifies "SignupLogin" button is visible
    When User clicks on "SignupLogin" button
    Then user verifies "Login to your account" text is visible
    When user enters <email> and <password>
    And user clicks on "Login" button
    Then user verifies that "Logged in as username" text is visible