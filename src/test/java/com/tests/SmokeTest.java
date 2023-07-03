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
        startTest("Verify that all the fields can be filled and save. ", "All the fields can be filled and saved.");
       HomePage.clickOnMaster(driver);
       MasterPage.clickonAddbranch(driver);
       AddbranchPage.enterBranchDetails(driver);
   }
    @Test
    public void addBranchwithmandatoryfields(Method method) throws InterruptedException {
        startTest("Verify that all mandatory fields are filled or not.", "All the mandatory fields can be filled.");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.addbranchwithmandatoryfields(driver);
    }

    @Test
    public void verifyMandatorylabels(Method method) throws InterruptedException {
        startTest("Verify that the Mandatory field label of hierarchy field is displayed or not.", "There is no error message showing in Hierarchy field.");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyMandatoryFields(driver);
    }
    @Test
    public void calenderinput(Method method) throws InterruptedException {
        startTest("Verify that the inaugration date can be filled by keyboard", "Inauguration date cannot be added by keyboard.");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.calenderinput(driver);
    }

    @Test
    public void verifyphonenumber(Method method) throws InterruptedException {
        startTest("Verify that the signs +,- are allowed in phone number field.", "verifyphonenumber");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyphonenumber(driver);
    }
    @Test
    public void verifybranchcode(Method method) throws InterruptedException {
        startTest("Verify that the Branch Code accepts only Alphanumeric value.", "Branch code ");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifybranchcode(driver);
    }
    @Test
    public void verifybranchname(Method method) throws InterruptedException {
        startTest("Verify that the Branch Name accepts only Alphanumeric value.", "Branch Name");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifybranchname(driver);
    }

    @Test
    public void verifygst(Method method) throws InterruptedException
    {
        startTest("Verify that the GST Field is accepting 15 valid GST Number", "GST NUMBER");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifygst(driver);
    }
    @Test
    public void verifyservicenumber(Method method) throws InterruptedException
    {
        startTest("Verify that the service number accepts only numbers", "Service number");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyservicenumber(driver);
    }
    @Test
    public void verifylatitude(Method method) throws InterruptedException
    {
        startTest("Verify that latitude field accepts decimal value or not", "latitude");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifylatitude(driver);
    }
    @Test
    public void verifyLongitude(Method method) throws InterruptedException {
        startTest("Verify that the longitude field accepts decimal value or not", "Longitude");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifylongitude(driver);
    }
    @Test
    public void verifystaticip(Method method) throws InterruptedException
    {
        startTest("Verify that the Static IP accepts valid Ip address or not", "verifystaticip");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifystaticip(driver);
    }
    @Test
    public void verifyLatitudelabel(Method method) throws InterruptedException {
        startTest("Verify that the Lattitude label is written correctly", "verifyLatitudelabel");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyLatitudelabel(driver);
    }
//    @Test
//    public void delete(Method method) throws InterruptedException {
//        startTest(method.getName(), "delete");
//        HomePage.clickOnMaster(driver);
//        MasterPage.clickonbranchlist(driver);
//        BranchListPage.delete_branch_list(driver);
//    }
    @Test
    public void edit(Method method) throws InterruptedException {
        startTest("Verify that the edit option is working properly or not", "edit");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonbranchlist(driver);
        BranchListPage.edit_branch_list(driver);
    }
    @Test
    public void branchcode(Method method) throws InterruptedException {
        startTest("Verify that the Branch Code is marked with asterisk sign or not", "mandatory sign missing");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonbranchlist(driver);
        BranchListPage.branchcode_notmarkedwith_asterisksign(driver);
    }
    @Test
    public void time(Method method) throws InterruptedException {
        startTest("Verify that the inauguration time shows only one dialog box.", "time");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonbranchlist(driver);
        BranchListPage.inauguration_time(driver);
    }
    @Test
    public void save_already_deleted_data(Method method) throws InterruptedException {
        startTest("Verify that the trying to save already deleted branch details. ", "save_already_deleted_data");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.save_details(driver);
    }
    @Test
    public void spelling_error(Method method) throws InterruptedException {
        startTest("Verify the spelling mistake ", "spelling_error");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.branch_already_exist(driver);
    }
    @Test
    public void buttonlabel(Method method) throws InterruptedException {
        startTest("verify that the alignment of the bottom label is proper or not","");
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.bottomlabel(driver);
    }

//  @AfterMethod
//    public void tearDown(){
//
//        driver.quit();
//    }

}
