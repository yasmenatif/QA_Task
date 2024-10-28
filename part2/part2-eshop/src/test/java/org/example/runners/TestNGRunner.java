package org.example.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.utils.ExtentManager;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.stepDefs"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @AfterSuite
    public void tearDown() {
        ExtentManager.endTest();
    }
}
