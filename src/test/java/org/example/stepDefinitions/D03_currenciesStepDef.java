package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("user selects Euro from dropdown list")
    public void user_selects_Euro() throws InterruptedException {
        homePage.Eurocurrency().sendKeys("Euro");
        Thread.sleep(4000);
    }

    @And("Euro is displayed as currency")
    public void Eurocurrency_is_displayed()
    {
        Assert.assertTrue(homePage.Eurocurrency().isDisplayed());

    }

    @Then("user can see The 4 products are showing with Euro sign")
    public void products_Euro_sign()
    {
     int count =   Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).size();
     for (int X = 0; X < count; X++ )
        {
            String text = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(X).getText();
            Assert.assertTrue(text.contains("€"));

        }
    }






}
