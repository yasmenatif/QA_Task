package org.example.stepDefs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;


    private static ExtentReports extent = ExtentManager.getReporterObject();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Before
    public void setUp(Scenario scenario){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        driver.get("https://www.google.com/");

        ExtentTest test = extent.createTest(scenario.getName());
        extentTest.set(test);
        ExtentManager.setTest(test);
        ExtentManager.getTest().log(Status.INFO, "Starting scenario: " + scenario.getName());

    }


    @After
    public void shutDown(Scenario scenario) {

        if (scenario.isFailed()) {
            ExtentManager.getTest().log(Status.FAIL, "Test Failed: " + scenario.getName());
        } else {
            ExtentManager.getTest().log(Status.PASS, "Test Passed: " + scenario.getName());
        }
        if (driver != null) {
            driver.quit();
        }

    }
        public static ExtentTest getTest() {
            return extentTest.get();
        }

    }



