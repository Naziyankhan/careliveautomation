package com.tests.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import javax.security.auth.login.AccountLockedException;

public class AddGRNPage {
    static By SUPPLIER = By.name("supplier");
    static By BILLNO = By.id("billNum");
    static By PURCHASETYPE = By.name("purchaseSelected");
    static By COMMERICAL = By.xpath("//span[@class='mat-option-text' and text()='Commercial ']");
    static By CONSUMER = By.xpath("//span[@class='mat-option-text' and text()='Consumer']");
    static By ITEMNAME = By.id("mat-input-15");
    static By QTY = By.id("txtQty");
    static By RATE = By.id("txtRate");
    static By BATCH = By.id("idImei");
    static  By IMEI = By.id("idImei");
    static By SAVE1 = By.xpath("//button[@class='btn btn-default m-r-10']");
    static By SAVE = By.xpath("//button[@class='mt-3 btn save_btn m-r-10']");
    static  By Modal = By.xpath("//div[@class='col-md-12']");
    static By SUPPLIER1 = By.xpath("//span[contains(text(),' SUP011-The Matrix Infotech Paradigms It ')]");
    static By ITEM = By.xpath("//span[contains(text(),' SRVS2636-Redmi 9 Power Screen Guard ')]");
     static By SUCCESSMSG = By.xpath("swal2-content");
     static By OK =By.xpath("//button[contains(@class, 'swal2-confirm')]");
    static By ADD =By.id("add_button");
    static By ITEM1 = By.xpath("CCTV0052-4Tb Thoshiba Hdd");
    static  By ADDITEM =By.xpath("mat-input-22");
    public static void addGRN(WebDriver driver) throws InterruptedException {

        driver.findElement(SUPPLIER).sendKeys("Matrix");
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).click();
        Thread.sleep(300);
        driver.findElement(BILLNO).sendKeys("12345");
        driver.findElement(PURCHASETYPE).click();
        Thread.sleep(200);
        driver.findElement(COMMERICAL).click();
        driver.findElement(ITEMNAME).sendKeys("screen");
        Thread.sleep(200);
        driver.findElement(ITEM).click();
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).sendKeys("40000");
        driver.findElement(BATCH).click();
        driver.findElement(Modal).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        Assert.assertTrue(driver.findElement(SAVE).isDisplayed(), "GRN should be saved successfully");
    }

    public static void Addoneitems(WebDriver driver) throws InterruptedException {


        driver.findElement(SUPPLIER).sendKeys("Matrix");
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).click();
        Thread.sleep(300);
        driver.findElement(BILLNO).sendKeys("1478");
        driver.findElement(PURCHASETYPE).click();
        Thread.sleep(200);
        driver.findElement(COMMERICAL).click();
        driver.findElement(ITEMNAME).sendKeys("tv");
        Thread.sleep(200);
        driver.findElement(ITEM1).click();
        driver.findElement(RATE).sendKeys("38000");
        driver.findElement(IMEI).sendKeys("12345667");
        driver.findElement(SAVE1).click();

        driver.findElement(ADD).click();


        driver.findElement(ITEMNAME).sendKeys("screen");
        Thread.sleep(200);
        driver.findElement(ITEM).click();
       // driver.findElement(QTY).sendKeys("");
        driver.findElement(RATE).sendKeys("40000");
       // driver.findElement(BATCH).click();
        driver.findElement(IMEI).click();
        driver.findElement(IMEI).sendKeys("123456789");

        driver.findElement(Modal).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        Assert.assertTrue(driver.findElement(SAVE).isDisplayed(), "GRN should be saved successfully");
    }
        public static void Sameitem (WebDriver driver) throws InterruptedException {

            driver.findElement(SUPPLIER).sendKeys("SUP005-The Matrix Infotech Paradigms ");
            Thread.sleep(300);
            driver.findElement(BILLNO).sendKeys("4586");
            driver.findElement(PURCHASETYPE).click();
            driver.findElement(COMMERICAL).click();
            driver.findElement(ITEMNAME).sendKeys("SRVS2633-Realme C3 Screen Guard");
            driver.findElement(QTY).sendKeys("10");
            driver.findElement(RATE).sendKeys("100");
            driver.findElement(BATCH).click();
            driver.findElement(SAVE1).click();
            driver.findElement(ADD).click();

            driver.findElement(ITEMNAME).sendKeys("SRVS2633-Realme C3 Screen Guard");
            driver.findElement(QTY).sendKeys("10");
            driver.findElement(RATE).sendKeys("100");
            driver.findElement(BATCH).click();
            driver.findElement(SAVE1).click();

            driver.findElement(SAVE).click();
            Assert.assertTrue(driver.findElement(SAVE).isDisplayed(), "");

        }
    public static void successmsg (WebDriver driver) throws InterruptedException {
        driver.findElement(SUPPLIER).click();
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).sendKeys("SUP005-The Matrix Infotech Paradigms ");
        driver.findElement(COMMERICAL).click();
        driver.findElement(ITEMNAME).sendKeys("");
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).sendKeys("100");
        driver.findElement(BATCH).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        Assert.assertTrue(driver.findElement(SUCCESSMSG).isDisplayed(), "success msg");
    }

    public static void countchanges(WebDriver driver) throws InterruptedException {
        driver.findElement(SUPPLIER).click();
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).click();
        driver.findElement(COMMERICAL).click();
        driver.findElement(ITEMNAME).sendKeys("");
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).sendKeys("100");
        driver.findElement(BATCH).click();
        driver.findElement(ADD).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
       // Assert.assertTrue(driver.findElement(SUCCESSMSG).isDisplayed(), "success msg");
    }

    public static void validation(WebDriver driver)
    {
            driver.findElement(SAVE).click();

    }
}