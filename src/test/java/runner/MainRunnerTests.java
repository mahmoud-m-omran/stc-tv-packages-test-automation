package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"C:/TestCrew/stc_tv_project/src/test/java/features"}, glue = {"stcTvPackagesTests"},
        monochrome = false, dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports"},
        publish = true //this means publish the report on the cloud
)
public class MainRunnerTests extends AbstractTestNGCucumberTests {
    //    this part is written to allow parallel execution
    @Override
    @DataProvider(parallel = true) // to run your test cases in parallel mode
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

