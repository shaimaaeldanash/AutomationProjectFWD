package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D08_WishlistStepDef {

    P03_homePage homePage = new P03_homePage();

    int number;

    @Given("user adds products to wishlist")
    public void adds_product_wishlist() throws InterruptedException {
        homePage.WishListbuttons().get(2).click();
        Thread.sleep(3000);

    }

    @Then("success message is visible and displayed")
    public void successMsgDisplayed()
    {
        Assert.assertTrue(homePage.WishList_successMsg().isDisplayed());
    }

    @When("user get the number of wishlist items after adding product")
    public void wish_listitems()
    {
        homePage.SuccessMessageclose().click();
        String text= homePage.WishListText().getText();
        text = text.replaceAll("[^0-9]" ,"");
        number = Integer.parseInt(text);

    }
    @Then("number of wishlist items increased")
    public void items_increased()
    {
        Assert.assertTrue(number>0);
    }



}
