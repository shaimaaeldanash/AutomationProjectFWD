package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import org.example.pages.P01_register;

public class D01_registerStepDef {
    P01_register p01reg = new P01_register();

    @Given("user go to register page")

    public void go_to_register()
    {
        p01reg.registerlink().click();
    }


    @When("user select gender type")
    public void gender()
    {
        p01reg.genderType("gender-male");
        //Hooks.driver.findElement(By.id("gender-male")).click();
    }


    @And("user enter first name Shaimaa and last name Nasser")

        public void first_last_name()

        {
            p01reg.firstNameTxt().sendKeys("Shaimaa");
            p01reg.lastNameTxt().sendKeys("Nasser");
            //Hooks.driver.findElement(By.id("FirstName")).sendKeys();
            //Hooks.driver.findElement(By.id("LastName")).sendKeys();
        }

    @And("user enter date of birth")

    public void date_of_Birth()
    {
        p01reg.birthDay().click();
        p01reg.birthMonth().click();
        p01reg.birthYear().click();

        /*WebElement birthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(birthDay);
        select.selectByIndex(10); // select by index: this is day 10

        WebElement birthMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        select = new Select(birthMonth);
        select.selectByValue("3"); // select by value and it should be String: this is March

        WebElement birthYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1998"); // select by linkText and it should be String */
    }

    @And("user enter email user1@example.com field")

    public void personal_details()
    {
        p01reg.EmailTxt().sendKeys("user1@example.com");
        //Hooks.driver.findElement(By.id("Email")).sendKeys();
    }

    @And("user fills Password fields P@ssw0rd ,P@ssw0rd")

        public void your_password()

        {
            p01reg.passwordTxt().sendKeys("P@ssw0rd");
            p01reg.confirmpassTxt().sendKeys("P@ssw0rd");
            //Hooks.driver.findElement(By.id("Password")).sendKeys();
            //Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys();
        }

        @And("user clicks on register button")

        public void register_button() throws InterruptedException {
            p01reg.registerBtn();
            p01reg.confirmpassTxt().sendKeys(Keys.ENTER);
            Thread.sleep(4000);
            //Hooks.driver.findElement(By.id("register-button"));
        }

        @Then("success message is displayed")

        public void Register_success()
        {
            String expectedResult = "Your registration completed";
            String actualResult = p01reg.result().getText();
            SoftAssert soft = new SoftAssert();
            // First Assertion
            soft.assertTrue(actualResult.contains(expectedResult));
            //Second Assertion
            String expectedSuccessMsgColor = "rgba(76, 177, 124, 1)";
            String actualSuccessMsgColor = p01reg.result().getCssValue("color");
            System.out.println("SuccessMsg Color:"+ actualSuccessMsgColor);
            soft.assertTrue(actualSuccessMsgColor.contains(expectedSuccessMsgColor));
            soft.assertAll();

        }


}


