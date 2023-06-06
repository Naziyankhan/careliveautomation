package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeMethod
    public void setUp() {
        extent = ExtentManager.getInstance();
    }
    @Test
    public  void TestCase1()
    {
        test = extent.createTest("TEST CASE 1 - Verify that branch code is marked with asterisk sign or not", "An asterisk sign is missing in the placeholder");
    }
    @Test
    public void TestCase2()
    {
        test = extent.createTest("TEST CASE 2 - Verify that Latitude Label is written correctly", "All the labels should be written as same.");
    }
    @Test
    public void TestCase3()
    {
        test = extent.createTest("TESTCASE 3 - ");
    }

    @AfterMethod
    public void resultset(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {
            test.log(Status.FAIL,"Test is Failed" +result.getThrowable());
        }
        if(result.getStatus()==ITestResult.SKIP)
        {
            test.log(Status.SKIP,"Test is Skipped" +result.getThrowable());
        }
        if(result.getStatus()==ITestResult.SUCCESS)
        {
            test.log(Status.PASS,"Test is passed" +result.getThrowable() );
        }
    }

    @AfterTest
    public void tearDown() {
        extent.flush();
    }
}


