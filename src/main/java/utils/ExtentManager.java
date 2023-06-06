package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;
    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = "C:\\Users\\Exam user\\IdeaProjects\\REPORT\\carelivereport.html";
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
            htmlReporter.config().setReportName("ADD BRANCH TESTING");
            htmlReporter.config().setDocumentTitle("CARELIVE REPORT");
            htmlReporter.config().setTheme(Theme.STANDARD);

            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Hostname","Localhost");
            extent.setSystemInfo("platform","windows");
            extent.setSystemInfo("Browser","Chrome");

     }
        return extent;
    }
}

