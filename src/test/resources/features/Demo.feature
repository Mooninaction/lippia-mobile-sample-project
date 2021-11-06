Feature: As a potential user, I want to interact with the mobile application
@Smoke @Luna
  Scenario: The user does a successful login
    Given The app is loaded correctly
    When  The user enters in the Sign Up page with: email "lunasauri.ls@gmail.com", password "3snwyJnznE69A4J"
    Then  Home page is displayed

  @Smoke @Luna
  Scenario: The user taps to enable dark mode
    Given The user does a successful login
    When  The user clicks on the Hamburger Menu
    And   The user clicks on settings
    And   The user clicks on tap enable dark mode
    Then  The user verifies that the profile goes into dark mode

   @Smoke
  Scenario: The user uploads a task
    Given The app is loaded correctly
    When  The user clicks on the project
    And   The user clicks on Tasks
    And   The user uploads a task
    Then  The user verifies that this task was loaded correctly