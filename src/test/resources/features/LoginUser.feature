Feature: Login User

  Scenario: Login user with correct email and password
    Given User navigates to the "baseUrl" page
    Then User verifies "SignupLogin" button is visible
    When User clicks on "SignupLogin" button
    Then user verifies "Login to your account" text is visible
    When user enters <email> and <password>
    And user clicks on "Login" button
    Then user verifies "Logged in as username" text is visible


  @Negative
  Scenario: Login user with incorrect email and password
    Given User navigates to the "baseUrl" page
    Then User verifies "SignupLogin" button is visible
    When User clicks on "SignupLogin" button
    Then user verifies "Login to your account" text is visible
    When user enters invalid <email> and <password>
    And  user clicks on "Login" button
    Then user verifies "Your email or password is incorrect!" text is visible
