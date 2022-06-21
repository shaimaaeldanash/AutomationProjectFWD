package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_FollowUsStepDef {

    P03_homePage homePage = new P03_homePage();
    ArrayList<String> Tabs;

    @Given("user clicks on Facebook icon link")
    public void clicks_Facebook_icon()
    {
        homePage.FacebookLink().click();
    }

    @Then("Facebook is opened successfully in new tab")
    public void Facebook_opens_success() throws InterruptedException {
        Thread.sleep(3000);
        Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");

        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

    }

    @Given("user clicks on Twitter icon link")
    public void clicks_Twitter_icon()
    {
        homePage.TwitterLink().click();
    }

    @Then("Twitter is opened successfully in new tab")
    public void Twitter_opens_success() throws InterruptedException {
        Thread.sleep(3000);
        Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

    }
    @Given("user clicks on rss icon link")
    public void clicks_rss_icon()
    {
        homePage.rssLink().click();
    }

    @Then("rss is opened successfully in new tab")
    public void rss_opens_success() throws InterruptedException {
        Thread.sleep(3000);
        Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

    }

    @Given("user clicks on YouTube icon link")
    public void clicks_YouTube_icon()
    {
        homePage.YoutubeLink().click();
    }

    @Then("YouTube is opened successfully in new tab")
    public void YouTube_opens_success() throws InterruptedException {
        Thread.sleep(3000);
        Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");

        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());

    }





}
