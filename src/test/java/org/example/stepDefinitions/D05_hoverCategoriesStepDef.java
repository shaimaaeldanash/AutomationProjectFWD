package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D05_hoverCategoriesStepDef {

    P03_homePage home = new P03_homePage();

    String subCategoryName;

    String subCategoryText;


    @Given("user hover on Category and selects one of the subcategories")
    public void user_hover_Category() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);
        //hover on computers
        //WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(home.computers()).perform();
        subCategoryName = home.desktops().getText().toLowerCase().trim();
        Thread.sleep(4000);
        Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]")).click();
    }

    @Then("user clicks on Desktops in subcategory")
    public void clicks_desktops()
    {
        SoftAssert soft = new SoftAssert();
        subCategoryText = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText().toLowerCase().trim();
        System.out.println("SubCategoryText:" + subCategoryText);
        soft.assertEquals(subCategoryText,subCategoryName);
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/desktops"),"true");
        soft.assertAll();
    }

}
