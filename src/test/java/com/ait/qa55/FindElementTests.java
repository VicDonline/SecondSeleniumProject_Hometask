package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebElement h1 = driver.findElement(By.id("small-searchterms"));
        System.out.println("Search box found by id: " + h1.getText());


    }

    @Test
    public void findElementsByClassName() {
        WebElement item = driver.findElement(By.className("product-item"));
        System.out.println("Product item found: " + item.getText());
    }

    @Test
    public void findHeaderWrapperByClass() {
        WebElement header = driver.findElement(By.className("header"));
        System.out.println("Header class found: " + header.getTagName());
    }

    @Test
    public void findFooterWrapperByClass() {
        WebElement footer = driver.findElement(By.className("footer"));
        System.out.println("Footer class found: " + footer.getTagName());
    }

    @Test
    public void findTopMenuByClass() {
        WebElement menu = driver.findElement(By.className("top-menu"));
        System.out.println("Top menu found: " + menu.getText());
    }

    @Test
    public void findProductGridByClass() {
        WebElement grid = driver.findElement(By.className("product-grid"));
        System.out.println("Product grid class name: " + grid.getAttribute("class"));
    }

    @Test
    public void findListOfProductItems() {
        List<WebElement> items = driver.findElements(By.className("product-item"));
        System.out.println("Total product items: " + items.size());
    }

    @Test
    public void findCartLinkByClass() {
        WebElement cart = driver.findElement(By.className("cart-label"));
        System.out.println("Cart label text: " + cart.getText());
    }

    @Test
    public void findLogoByClass() {
        WebElement logo = driver.findElement(By.className("header-logo"));
        System.out.println("Logo tag name: " + logo.getTagName());
    }


}
