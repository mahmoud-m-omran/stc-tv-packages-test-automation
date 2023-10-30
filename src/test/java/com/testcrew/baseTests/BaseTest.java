package com.testcrew.baseTests;

import com.testcrew.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected HomePage homePage;
    protected WebDriver driver;

    @Parameters({"browser"})
    public void setup(@Optional("chrome") String browser) {
        if ("firefox".equalsIgnoreCase(browser)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if ("edge".equalsIgnoreCase(browser)) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        driver.get("https://subscribe.stctv.com/sa-en");
    }

    public void tearDown() {
            driver.quit();
    }
}
