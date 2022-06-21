package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("user clicks on first slider")
    public void clicks_first_slider()
    {
        homePage.Slider("1").click();

    }

    @Then("relative product for first slider gets displayed")
    public void first_slider_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");

    }

    @Given("user clicks on second slider")
    public void clicks_second_slider()
    {
        homePage.Slider("2").click();
    }

    @Then("relative product for second slider gets displayed")
    public void second_slider_displayed() throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone_g9");
        Thread.sleep(2000);

    }





}
