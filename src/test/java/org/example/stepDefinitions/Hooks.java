package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Hooks {
    //define before and after annotation for your driver
    public static WebDriver driver = null;

    @Before
    public void openBrowser()
    {
        //1- should be first step in your code
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        //2- new object
         driver = new ChromeDriver();

         //3- Configuration to the driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //4- Navigate to the url
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
