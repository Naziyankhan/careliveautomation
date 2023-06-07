package com.tests;

import com.tests.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import utils.driverHelper;

import static utils.ExtentTestManager.startTest;


public class SmokeTest {

    public WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }



    @BeforeMethod
    public void lanuchLogin() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driverHelper.setDriver(driver);
        LoginPage.login(driver);
    }

  @Test
   public void addBranch(Method method) throws InterruptedException {
        startTest(method.getName(), "Invalid Login Scenario with empty username and password.");
       HomePage.clickOnMaster(driver);
       MasterPage.clickonAddbranch(driver);
       AddbranchPage.enterBranchDetails(driver);
   }
    @Test
    public void addBranchwithmandatoryfields(Method method) throws InterruptedException {
        startTest(method.getName(), "addBranchwithmandatoryfields");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.addbranchwithmandatoryfields(driver);
    }

//    @Test
//    public void verifyMandatorylabels(Method method) throws InterruptedException {
//        startTest(method.getName(), "verifyMandatorylabels");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifyMandatoryFields(driver);
//    }
//    @Test
//    public void calenderinput(Method method) throws InterruptedException {
//        startTest(method.getName(), "calenderinput");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.calenderinput(driver);
//    }
//
//    @Test
//    public void verifyphonenumber(Method method) throws InterruptedException {
//        startTest(method.getName(), "verifyphonenumber");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifyphonenumber(driver);
//    }
//    @Test
//    public void verifybranchcode(Method method) throws InterruptedException {
//        startTest(method.getName(), "verifybranchcode");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifybranchcode(driver);
//    }
//    @Test
//    public void verifybranchname(Method method) throws InterruptedException {
//        startTest(method.getName(), "verifybranchname");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifybranchname(driver);
//    }
//
//    @Test
//    public void verifygst(Method method) throws InterruptedException
//    {
//        startTest(method.getName(), "verifygst");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifygst(driver);
//    }
//    @Test
//    public void verifyservicenumber(Method method) throws InterruptedException
//    {
//        startTest(method.getName(), "verifyservicenumber");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifyservicenumber(driver);
//    }
//    @Test
//    public void verifylatitude(Method method) throws InterruptedException
//    {
//        startTest(method.getName(), "verifylatitude");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifylatitude(driver);
//    }
//    @Test
//    public void verifyLongitude(Method method) throws InterruptedException {
//        startTest(method.getName(), "verifyLongitude");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifylongitude(driver);
//    }
//    @Test
//    public void verifystaticip(Method method) throws InterruptedException
//    {
//        startTest(method.getName(), "verifystaticip");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifystaticip(driver);
//    }
//    @Test
//    public void verifyLatitudelabel(Method method) throws InterruptedException {
//        startTest(method.getName(), "verifyLatitudelabel");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.verifyLatitudelabel(driver);
//    }
//    @Test
//    public void delete(Method method) throws InterruptedException {
//        startTest(method.getName(), "delete");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonbranchlist(driver);
//        BranchListPage.delete_branch_list(driver);
//    }
//    @Test
//    public void edit(Method method) throws InterruptedException {
//        startTest(method.getName(), "edit");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonbranchlist(driver);
//        BranchListPage.edit_branch_list(driver);
//    }
//    @Test
//    public void branchcode(Method method) throws InterruptedException {
//        startTest(method.getName(), "branchcode");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonbranchlist(driver);
//        BranchListPage.branchcode_notmarkedwith_asterisksign(driver);
//    }
//    @Test
//    public void time(Method method) throws InterruptedException {
//        startTest(method.getName(), "time");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonbranchlist(driver);
//        BranchListPage.inauguration_time(driver);
//    }
//    @Test
//    public void save_already_deleted_data(Method method) throws InterruptedException {
//        startTest(method.getName(), "save_already_deleted_data");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.save_details(driver);
//    }
//    @Test
//    public void spelling_error(Method method) throws InterruptedException {
//        startTest(method.getName(), "spelling_error");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonAddbranch(driver);
//        AddbranchPage.branch_already_exist(driver);
//    }

  @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
