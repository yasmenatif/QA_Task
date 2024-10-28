package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports getReporterObject() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("extent-reports/index.html");
            reporter.config().setReportName("Automation Test Results");
            reporter.config().setDocumentTitle("Test Results");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Your Name");
        }
        return extent;
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void setTest(ExtentTest test) {
        ExtentManager.test = test;
    }
}
