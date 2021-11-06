package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @io.cucumber.java.en.When("The user clicks on the Hamburger Menu")
    public void theUserClicksOnTheHamburgerMenu() {
        HomeService.HamburgerMenu();
    }

    @When("The user clicks on the project")
    public void theUserClicksOnTheProject() {
        HomeService.goProject();
    }

    @And("The user clicks on settings")
    public void theUserClicksOnSettings() {
        HomeService.settings();
    }

    @And("The user clicks on tap enable dark mode")
    public void theUserClicksOnTapEnableDarkMode() {
        HomeService.mode();
    }

    @And("The user clicks on Tasks")
    public void theUserClicksOnTasks() {
        HomeService.tasks();
    }

    @And("The user uploads a task")
    public void theUserUploadsATask() {
        HomeService.uploadsTask();
    }

    @io.cucumber.java.en.Then("The user verifies that the profile goes into dark mode")
    public void theUserVerifiesThatTheProfileGoesIntoDarkMode() {
        HomeService.isDarkMode();
    }

    @io.cucumber.java.en.Then("The user verifies that this task was loaded correctly")
    public void theUserVerifiesThatThisTaskWasLoadedCorrectly() {
        HomeService.TaskLoaded();
    }

    @Then("Home page is displayed")
    public void isHomePageVisible() {
        HomeService.isViewLoaded();
    }


}
