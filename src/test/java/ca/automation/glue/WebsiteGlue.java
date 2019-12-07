package ca.automation.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * created by Shoby on 2019-11-28
 **/

public class WebsiteGlue {

    @Given("I launch tangerine website")
    public void launch(){
        StepHooks.driver.get("https://www.tangerine.ca/en");
    }

    @When("i click login")
    public void clicklogin(){
        //StepHooks.driver.findElement(B)
    }

    @Given("printout")
    public void print(){
        //System.out.println("shoby");
        StepHooks.driver.get("http://letzdotesting.com");
    }

}
