package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P02_login {

    public WebElement P02loginPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement loginEmail() {
        return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement loginPassword()
    {
        return Hooks.driver.findElement(By.id("Password"));

    }


    public void login_Steps(String email, String password)
    {
        loginEmail().clear();
        loginEmail().sendKeys(email);
        loginPassword().sendKeys(password);
    }

   /* public WebElement successLoginPom()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));
    }*/


    public WebElement SubmitBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));

        //button[class="button-1 search-box-button"]
    }
    public By MyAccount()
    {
        return By.cssSelector("a[class=\"ico-account\"]");
    }



}
