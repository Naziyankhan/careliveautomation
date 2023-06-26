package com.tests;

import com.tests.pages.HomePage;
import com.tests.pages.LoginPage;
import com.tests.pages.AddGRNPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.driverHelper;

import java.util.concurrent.TimeUnit;

import static utils.ExtentTestManager.startTest;

public class PurchaseTest {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeTest
    public void launchlogin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driverHelper.setDriver(driver);
        LoginPage.login(driver);
    }

    @Test
        public void addGRN() throws InterruptedException {
        startTest(" Verify that items can be added to the GRN with valid details", "saved successfully");
        Thread.sleep(300);
        HomePage.ClickOnAddGRN(driver);
        Thread.sleep(300);
        AddGRNPage.addGRN(driver);
    }


    @Test
        public void additems() throws InterruptedException {
        startTest("Check whether the user can add items", "items add");
        Thread.sleep(300);
        HomePage.ClickOnAddGRN(driver);
        Thread.sleep(300);
        AddGRNPage.Addoneitems(driver);
    }


    @Test
        public void sameitemadded() throws InterruptedException {
        startTest("Check on adding the new item multiple times.", "same item ");
       Thread.sleep(200);
       HomePage.ClickOnAddGRN(driver);
        AddGRNPage.Sameitem(driver);
        }

    @Test
        public void successmsg() throws InterruptedException {
        startTest("Check success message is displayed or not when a item is added.","fields are added");
        Thread.sleep(300);
        HomePage.ClickOnAddGRN(driver);
        AddGRNPage.successmsg(driver);
 }
    @Test
        public void countchanges() throws InterruptedException {
        startTest("Check that the count changes on adding or removing items.","");
        Thread.sleep(500);
        HomePage.ClickOnAddGRN(driver);
        AddGRNPage.countchanges(driver);

    }
    @Test
    public void validation() throws InterruptedException {
        startTest("check the validation of input box","");
        HomePage.ClickOnAddGRN(driver);
        Thread.sleep(200);
        AddGRNPage.validation(driver);
    }
    @Test
        public void amount() throws InterruptedException {
     startTest("Check whether amount changes when user add items.","");
     HomePage.ClickOnAddGRN(driver);
     Thread.sleep(300);
     AddGRNPage.amount(driver);
 }
    @Test
        public void amount1() throws InterruptedException {
     startTest("check whether amount changes when user removes items.","");
     HomePage.ClickOnAddGRN(driver);
     Thread.sleep(200);
     AddGRNPage.amount1(driver);
 }
    @Test
        public void finalamount() throws InterruptedException {
        startTest("check the amount of all added items are displayed correctly or not", "");
        HomePage.ClickOnAddGRN(driver);
        AddGRNPage.finalamount(driver);
    }

}
