package com.testcrew.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = {"src/test/resources/features"},
    glue = {"com.testcrew.stcTvPackagesTests"},
    monochrome = false,
    dryRun = false,
    plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber-reports"},
    publish = true // This means publish the report on the cloud
)
public class MainRunnerTests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true) // To run your test cases in parallel mode
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
