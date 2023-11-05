package com.softserve.edu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.time.Duration;

public class SeleniumFirstTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //
        driver = new HtmlUnitDriver(false);
        //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tear() {
        driver.quit();
    }

    @BeforeEach
    public void setupThis() {
        //driver.get("https://demo.opencart.com/index.php");
        driver.navigate().to("https://demo.opencart.com/index.php");
    }

    @Test
    public void testSmoke() {
        WebElement search = driver.findElement(By.name("search"));
        System.out.println("search: " + search.isDisplayed());
        Assertions.assertTrue(search.isDisplayed());
    }
}
