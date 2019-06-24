package com.qa.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DirectValue {

    String val1;
    String val2;

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        System.out.println("i_have_a_calculator");
    }

    @When("^I add \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_add_something_and_something(String value1, String value2) throws Throwable {
        this.val1=value1;
        this.val2=value2;
        System.out.println("value1 : "+value1+"\n value2 : "+value2);
    }

    @Then("^the result should be 5$")
    public void the_result_should_be_5() throws Throwable {
        System.out.println("total : "+
                (Integer.parseInt(val1)+Integer.parseInt(val2)));
    }
}
