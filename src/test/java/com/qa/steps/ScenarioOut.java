package com.qa.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOut {
    @Given("^User is on Home Page$")
    public void user_is_on_home_page() throws Throwable {
        System.out.println("user_is_on_home_page");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_navigate_to_login_page() throws Throwable {
        System.out.println("user_navigate_to_login_page");
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_and_something(String username, String password) throws Throwable {
        System.out.println("user_enters_something_and_something : " +username+"  "+ " "+password+" ");
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_login_successfully() throws Throwable {
        System.out.println("message_displayed_login_successfully");
    }



}
