Feature: As a potential user, I want to interact with the mobile application
@Smoke @Luna
  Scenario: The user does a successful login
    Given The app is loaded correctly
    When  The user enters in the Sign Up page with: email "lunasauri.ls@gmail.com", password "3snwyJnznE69A4J"
    Then  Home page is displayed

  @Smoke
  Scenario: The user taps to enable dark mode // 2 - Realizar un tap, o cambiar el valor de un botón, como el de la imagen en el link adjunto, la elección del botón es de ustedes, pero no olviden confirmar que el estado del botón, cambió
    Given The app is loaded correctly
    When  The user clicks on the Hamburger Menu
    And   The user clicks on settings
    And   The user clicks on tap enable dark mode
    Then  The user verifies that the profile goes into dark mode

  @Smoke
  Scenario: The user uploads a task to a project // 3- Cargar algún ticket o una tarea a algún proyecto Para este punto. Primero deberan crear un proyecto. Esto lo deberán hacer de manera manual. Para luego automatizar la carga de una tarea a dicho proyecto en si
    Given The app is loaded correctly
    When  The user clicks on the project
    And   The user clicks on Tasks
    And   The user uploads a task
    Then  The user verifies that this task was loaded correctly