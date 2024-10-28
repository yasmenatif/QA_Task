package org.example.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ExtentManager;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        tags = "@smoke"
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        // Initialize Extent Reports
        ExtentManager.getReporterObject();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        // Flush the Extent Reports
        ExtentManager.getReporterObject().flush();
    }
}
