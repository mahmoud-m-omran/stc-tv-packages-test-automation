package baseTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.HomePage;

public class BaseTests {
    protected HomePage homePage;

    protected WebDriver driver;

    @Parameters({"browser"})
//    @Given("Saudi arabian customer will navigate to the stc tv main page")
    public void setup(@Optional String browser) {

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
