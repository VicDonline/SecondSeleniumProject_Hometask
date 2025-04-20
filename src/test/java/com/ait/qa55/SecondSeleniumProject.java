package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondSeleniumProject {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demowebshop.tricentis.com");
        // driver.navigate().back();
        //driver.get("https://demowebshop.tricentis.com");
        driver.navigate().refresh();// refresh

    }

    @Test
    public void openDemowebshopTest() {
        System.out.println("Sales!");

    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        // driver.quit();
        driver.close();

    }


}
