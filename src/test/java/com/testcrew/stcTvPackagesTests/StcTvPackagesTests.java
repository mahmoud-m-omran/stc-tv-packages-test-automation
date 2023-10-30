package com.testcrew.stcTvPackagesTests;

import com.testcrew.baseTests.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import java.util.List;

public class StcTvPackagesTests extends BaseTest {
    String browsers;

    @Parameters({"browser"})
    public void getBrowser(String browser) {
        browsers = browser;
    }

    @Before
    public void setupStcTV() {
        setup(browsers);
    }

    @After
    public void tearDownStcTV() {
        tearDown();
    }

    @Given("^bahraini customer will navigate to the stc TV main page$")
    @Given("^kuwaiti customer will navigate to the stc TV main page$")
    @Given("^saudi arabian customer will navigate to the stc TV main page$")
    public void navigateToHomePage() {

    }

    @When("^he or she should navigate to the STC TV package for Bahrain$")
    public void navigateToStcTVPackagesPageForBahrain() {
        homePage.clickOnCountryBtn();
        homePage.selectBahrainFlag();
    }

    @When("^he or she should navigate to the STC TV package for Kuwait$")
    public void navigateToStcTVPackagesPageForkUWAIT() {
        homePage.clickOnCountryBtn();
        homePage.selectKuwaitFlag();
    }

    @When("^he or she should see three packages$")
    public void verifyVisibilityOfThreePackages(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        String litePackageText = homePage.getLitePackageText();
        String classicPackageText = homePage.getClassicPackageText();
        String premiumPackageText = homePage.getPremiumPackageText();

        String litePackage = data.get(0).get(0);
        String classicPackage = data.get(0).get(1);
        String premiumPackage = data.get(0).get(2);

        Assert.assertEquals(litePackageText, litePackage);
        Assert.assertEquals(classicPackageText, classicPackage);
        Assert.assertEquals(premiumPackageText, premiumPackage);
    }

    @Then("^he or she should see the prices and currency of each package$")
    public void verifyPrices(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        String litePackagePrice = data.get(0).get(0);
        String classicPackagePrice = data.get(0).get(1);
        String premiumPackagePrice = data.get(0).get(2);
        String packageCurrency = data.get(0).get(3);

        Assert.assertEquals(homePage.getLitePackagePrice(), litePackagePrice);
        Assert.assertEquals(homePage.getClassicPackagePrice(), classicPackagePrice);
        Assert.assertEquals(homePage.getPremiumPackagePrice(), premiumPackagePrice);
        Assert.assertEquals(homePage.getCurrency(), packageCurrency);
    }
}
