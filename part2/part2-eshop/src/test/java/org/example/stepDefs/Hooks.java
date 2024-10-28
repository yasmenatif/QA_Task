package org.example.stepDefs;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.utils.ExtentManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;




    @Before
    public void setUp(Scenario scenario){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        driver.get("https://www.google.com/");

        ExtentTest test = ExtentManager.getExtentReports().createTest(scenario.getName());
        ExtentManager.setTest(test);
        ExtentManager.getTest().log(Status.INFO, "Starting scenario: " + scenario.getName());

    }


    @After
    public void shutDown(Scenario scenario) throws InterruptedException {

        if (scenario.isFailed()) {
            ExtentManager.getTest().log(Status.FAIL, "Test Failed: " + scenario.getName());
        } else {
            ExtentManager.getTest().log(Status.PASS, "Test Passed: " + scenario.getName());
        }
        if (driver != null) {
            driver.quit();
        }
        ExtentManager.endTest();

    }


}
