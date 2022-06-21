package org.example.pages;

import net.bytebuddy.asm.Advice;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    //D03_currenciesStepDef
    public WebElement Eurocurrency()
    {
        return Hooks.driver.findElement(By.name("customerCurrency"));

                //By.cssSelector("a[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));

    }

    public List<WebElement> productCurrency()
    {
        return Hooks.driver.findElements(By.className(""));
    }


//D04_searchStepDef

    public By productnamePOM ()
    {
        return By.name("q");

    }

    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }

    public List<WebElement> searchResult()
    {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"item-box\"]"));

    }

    public By ProductSKUPOM()
    {
        return By.id("small-searchterms");
    }

    public WebElement productSKUresult()
    {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    //D05_hoverCategoriesStepDef

    public WebElement computers()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }

    public WebElement desktops()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
    }

    //D06_homeSlidersStepDef

    public WebElement Slider(String sliderNum)
    {
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }

   //D07_FollowUsStepDef

    public WebElement FacebookLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement TwitterLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rssLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement YoutubeLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    //D08_WishlistStepDef

    public List<WebElement> WishListbuttons()
    {
       return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement WishList_successMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement SuccessMessageclose()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

    public WebElement WishListText()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }





}
