package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    public void  isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user enters in the Sign Up page with: email {string}, password {string}")
    public void theUserEntersInTheSignUpPageWithEmailPassword(String email, String password) {
    LoginService.doLogin(email, password);
    }
}
