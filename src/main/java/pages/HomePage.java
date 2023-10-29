package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    //Elements
    By litePackageText = By.id("name-lite");
    By litePackagePriceText = By.cssSelector("#currency-lite b");
    By litePackageCurrencyText = By.cssSelector("#currency-lite i");
    By classicPackageText = By.id("name-classic");
    By classicPackagePriceText = By.cssSelector("#currency-classic b");
    By classicPackageCurrencyText = By.cssSelector("#currency-classic i");
    By premiumPackageText = By.id("name-premium");
    By premiumPackagePriceText = By.cssSelector("#currency-premium b");
    By premiumPackageCurrencyText = By.cssSelector("#currency-premium i");
    By countryBtn = By.cssSelector(".head-links .country-current");
    By kuwaitCountryFlag = By.id("kw-contry-flag");
    By bahrainCountryFlag = By.id("bh-contry-flag");
    long sec = 20;
    private WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
    }


    public void clickOnCountryBtn() {
        int i = 0;
        do {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(countryBtn));
                driver.findElement(countryBtn).click();
                return;
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            i++;
        } while (i < 3);
    }

    public void selectKuwaitFlag() {
        int i = 0;
        do {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(kuwaitCountryFlag));
                driver.findElement(kuwaitCountryFlag).click();
                return;
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            i++;
        } while (i < 3);
    }

    public void selectBahrainFlag() {
        int i = 0;
        do {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(bahrainCountryFlag));
                driver.findElement(bahrainCountryFlag).click();
                return;
            } catch (NullPointerException e) {
            }
            i++;
        } while (i < 3);
    }


    public String getLitePackageText() {
        return getText(litePackageText);
    }


    public String getLitePackagePrice() {
        String currencyFullText = getText(litePackagePriceText);
        String[] currency = currencyFullText.split("/");
        return currency[0];
    }

    public String getCurrency() {
        String currencyFullText = getText(litePackageCurrencyText);
        String[] currency = currencyFullText.split("/");
        return currency[0];
    }

    public String getClassicPackageText() {
        return getText(classicPackageText);
    }

    public String getClassicPackagePrice() {
        return getText(classicPackagePriceText);
    }


    public String getPremiumPackageText() {
        return getText(premiumPackageText);
    }

    public String getPremiumPackagePrice() {
        return getText(premiumPackagePriceText);
    }


    private String getText(By element) {
        int i = 0;
        do {
            try {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
                return driver.findElement(element).getText();
            } catch (NullPointerException e) {
            }
            i++;
            return driver.findElement(element).getText();
        } while (i < 3);

    }
}

