package com.qa.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class DataTableInAStep {
    @Given("^User is on base Page$")
    public void user_is_on_home_page() throws Throwable {
        System.out.println("user_is_on_home_page");
    }

    @When("^User Navigate to home Page$")
    public void user_navigate_to_login_page() throws Throwable {
        System.out.println("user_navigate_to_login_page");
    }

    @Then("^Message displayed Login Success$")
    public void message_displayed_login_successfully() throws Throwable {
        System.out.println("message_displayed_login_successfully");
    }

    @And("^User enters Credentials to LogIn$")
    public void user_enters_credentials_to_login(DataTable dataTable) throws Throwable {

        List<String> stringList=dataTable.asList();
         

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        stringList.forEach(val -> System.out.print(val + " "));

    }

}
