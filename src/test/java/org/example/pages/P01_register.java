package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P01_register {

    public WebElement registerlink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement genderType(String type)
    {
        WebElement element = null;

        if (type.contains("male")) {
            element = Hooks.driver.findElement(By.id("gender-male"));
        }
        else if(type.contains("female")) {
            element = Hooks.driver.findElement(By.id("gender-female"));

        }
        return element;
    }

    public WebElement firstNameTxt()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNameTxt()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay()
    {return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]//option[@value=\"15\"]"));
    }
    //By.cssSelector("select[name=\"DateOfBirthDay\"]>option[value=\"10\"]\"")

    public WebElement birthMonth()
    {
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]//option[@value=\"2\"]"));

    }
    //By.cssSelector("select[name=\"DateOfBirthMonth\"]>option[value=\"3\"]\"")

    public WebElement birthYear()
    {
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]//option[@value=\"1989\"]"));

    }
      //By.name("select[name=\"DateOfBirthYear\"]>option[value=\"1998\"]\"")

    public WebElement EmailTxt()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordTxt()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmpassTxt()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }


    public WebElement registerBtn()
    {
        return  Hooks.driver.findElement(By.id("register-button"));
    }


    public WebElement result()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
    }
