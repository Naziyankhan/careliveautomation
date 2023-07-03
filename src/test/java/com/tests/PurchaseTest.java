package com.tests;
import com.tests.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import utils.driverHelper;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import static utils.ExtentTestManager.startTest;

public class PurchaseTest {
    public WebDriver driver;

    public WebDriver getDriver()
    {
        return driver;
    }

    @BeforeMethod
    public void launchlogin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driverHelper.setDriver(driver);
        LoginPage.login(driver);
    }

    @Test
        public void addGRN(Method method) throws InterruptedException {
        startTest(" Verify successfull creation of a GRN Purchase", " ");
        Thread.sleep(300);
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
        Thread.sleep(300);
        AddGRNPage.addGRN(driver);
    }


    @Test
        public void additems(Method method) throws InterruptedException {
        startTest("Check whether the user can add items", "items add");
        Thread.sleep(300);
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
        Thread.sleep(300);
        AddGRNPage.Addoneitems(driver);
    }


    @Test
        public void sameitemadded(Method method) throws InterruptedException {
        startTest("Check on adding the new item multiple times.", "same item ");
       Thread.sleep(200);
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
        AddGRNPage.Sameitem(driver);
        }

    @Test
        public void successmsg(Method method) throws InterruptedException {
        startTest("Check success message is displayed or not when a item is added.","fields are added");
        Thread.sleep(300);
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
        AddGRNPage.successmsg(driver);
 }
   // @Test
//        public void countchanges() throws InterruptedException {
//        startTest("Check that the count changes on adding or removing items.","");
//        Thread.sleep(500);
//        HomePage.ClickOnAddGRN(driver);
//        AddGRNPage.countchanges(driver);
//
//    }
    @Test
    public void validation(Method method) throws InterruptedException {
        startTest("verify validation of mandatory fields","");
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
        Thread.sleep(200);
        AddGRNPage.validation(driver);
    }
    @Test
        public void amount(Method method) throws InterruptedException {
     startTest("Check whether amount changes when user add items.","");
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
     Thread.sleep(300);
     AddGRNPage.amount(driver);
 }
    @Test
        public void amount1(Method method) throws InterruptedException {
     startTest("check whether amount changes when user removes items.","");
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
     Thread.sleep(200);
     AddGRNPage.amount1(driver);
 }
//    @Test
//        public void finalamount() throws InterruptedException {
//        startTest("check the amount of all added items are displayed correctly or not", "");
//        HomePage.ClickOnAddGRN(driver);
//        AddGRNPage.finalamount(driver);
//    }
    @Test
        public void displayCGSTSGST(Method method) throws InterruptedException {
        startTest("check whether CGST and SGST displays when an item is selected", "");
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
        AddGRNPage.displayCGSTSGST(driver);
    }
    @Test
      public void listGRN(Method method) throws InterruptedException {
        startTest("check whether saved item is displayed in List GRN","");
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnAddGRN(driver);
        GRNListPage.list(driver);
    }
    @Test
    public void ViewGRN(Method method) throws InterruptedException {
        startTest("check list to view","");
        HomePage.clickOnTransaction(driver);
        TransactionPage.ClickOnGRNList(driver);
        GRNListPage.view(driver);
    }






//    @AfterMethod
//    public void tearDown(){
//
//        driver.quit();
//    }

}
