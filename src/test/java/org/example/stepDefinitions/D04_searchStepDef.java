package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {

    P03_homePage home = new P03_homePage();

    SoftAssert soft = new SoftAssert();

    @Given("^user enters in search product name \"(.*)\"$")
    public void product_name (String productName)
    {
        Hooks.driver.findElement(home.productnamePOM()).sendKeys(productName);
    }

    @When("user clicks on search field in website home page")
    public void clicks_search_field() throws InterruptedException {
        home.searchButton().click();
        Thread.sleep(5000);
    }
    @Then("search should turn correct result with Apple products")
    public void apple_products_displayed() throws InterruptedException {
        //1st Assert
        String expectedResult = "https://demo.nopcommerce.com/search?q=Apple";
        String actualResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualResult.contains(expectedResult),"First Assert");
        //2nd Assert
        int resultSize =home.searchResult().size();
        soft.assertTrue(resultSize>0, "second Assert");
        soft.assertAll();
        Thread.sleep(5000);

    }

    @Given("^user enters in search product SKU \"(.*)\"$")
    public void productSKU(String productSKU) throws InterruptedException {
       Hooks.driver.findElement(home.ProductSKUPOM()).sendKeys(productSKU);
       Thread.sleep(4000);
    }

    @When("user clicks on search field in the website")
    public void clicks_searchfield() throws InterruptedException {
        Hooks.driver.findElement(home.ProductSKUPOM()).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }

    @Then("search should turn correct product result")
    public void correctSKU_displayed()
    {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"),"1st assert");
        System.out.println(Hooks.driver.getCurrentUrl());
        soft.assertTrue(home.productSKUresult().isDisplayed(),"2nd assert");
        soft.assertAll();
    }

}
