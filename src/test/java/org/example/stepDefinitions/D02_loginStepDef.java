package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
import org.example.pages.P02_login;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void loginpage()
    {
        login.P02loginPOM().click();
    }

    @When("user login with valid shaimaa.eldanash@gmail.com and P@ssw0rd")
    public void valid_loginemailpass()
    {
        login.loginEmail().sendKeys("shaimaa.eldanash@gmail.com");
        login.loginPassword().sendKeys("P@ssw0rd");
    }

//    @And("user login with invalid Shaimaa@example.com and P@ssw0rd")
//    public void user_enterValidData()
//    {
//        login.login_Steps("Shaimaa@example.com", "P@ssw0rd");
//    }

    @And("user press on login button")
    public void press_loginBtn() throws InterruptedException {
        login.SubmitBtn().click();
        Thread.sleep(3000);
    }

    @Then("user login to the system successfully")
    public void user_loginsuccessfully()
    {
        SoftAssert softAssert = new SoftAssert();
        //First Assertion
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Assert Equal");
        //Second Assertion
//        softAssert.assertTrue(Hooks.driver.findElement(login.MyAccount()).isDisplayed(), "Assert True");
        softAssert.assertAll();
    }

    @When("user login with invalid Shaimaa@example.com and P@ssw0rd")

    public void invalid_email_login_fail() throws InterruptedException
    {
        login.login_Steps("Shaimaa@example.com","P@ssw0rd");
        Thread.sleep(2000);
    }

    @Then("user could not login to the system")
    public void failed_login() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        //First Assertion
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/login?returnurl=%2F", "First");
        //Second Assertion
        String expectedResult = Hooks.driver.findElement(By.cssSelector("form > div[class=\"message-error validation-summary-errors\"]")).getText();
        String actualResult =  "Login was unsuccessful";
        softAssert.assertTrue(actualResult.contains(expectedResult),"Second");
        // Third Assertion
//        softAssert.assertTrue(Hooks.driver.findElement(login.MyAccount()).isDisplayed(), "Assert True");
//        Color.fromString("rgba(228, 67, 75, 1)").asHex();
//        System.out.println("#e4434b");
        softAssert.assertAll();

    }



}
