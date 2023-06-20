package com.tests.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import sun.security.provider.DRBG;

import java.sql.Statement;

public class AddGRNPage {
    static By SUPPLIER = By.name("supplier");
    static By BILLNO = By.xpath("billNum");
    static By PURCHASETYPE = By.name("purchaseSelected");
    static By COMMERICAL = By.xpath("//span[@class='mat-option-text' and text()='Commercial']");
    static By CONSUMER = By.xpath("//span[@class='mat-option-text' and text()='Consumer']");
    static By ITEMNAME = By.name("'item'+i");
    static By QTY = By.id("txtQty");
    static By RATE = By.id("txtRate");
    static By BATCH = By.name("naImei");
    static By SAVE1 = By.xpath("//button[@class='btn btn-default m-r-10']");
    static By SAVE = By.xpath("//button[@class='mt-3 btn save_btn m-r-10'][0]");
    static By SUPPLIER1 = By.xpath("//span[contains(text(),'HXTRS-Hexa Traders')]");
     static By SUCCESSMSG = By.xpath("swal2-content");
     static By OK =By.xpath("//button[contains(@class, 'swal2-confirm')]");
    static By ADD =By.id("add_button");
    public static void addGRN(WebDriver driver) throws InterruptedException {
        driver.findElement(SUPPLIER).click();
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).click();
        driver.findElement(BILLNO).sendKeys("12345");
        driver.findElement(PURCHASETYPE).click();
        driver.findElement(COMMERICAL).click();
        driver.findElement(ITEMNAME).sendKeys("");
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).sendKeys("100");
        driver.findElement(BATCH).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        Assert.assertTrue(driver.findElement(SAVE).isDisplayed(), "GRN should be saved successfully");
    }

    public static void Additems(WebDriver driver) throws InterruptedException {
        driver.findElement(SUPPLIER).click();
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).click();
        driver.findElement(BILLNO).sendKeys("567895");
        driver.findElement(PURCHASETYPE).click();
        driver.findElement(COMMERICAL).click();
        driver.findElement(ITEMNAME).sendKeys("");
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).sendKeys("100");
        driver.findElement(BATCH).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        Assert.assertTrue(driver.findElement(SAVE).isDisplayed(), "");
    }

        public static void Sameitem (WebDriver driver) throws InterruptedException {
            driver.findElement(SUPPLIER).click();
            Thread.sleep(300);
            driver.findElement(SUPPLIER1).click();
            driver.findElement(BILLNO).sendKeys("567895");
            driver.findElement(PURCHASETYPE).click();
            driver.findElement(COMMERICAL).click();
            driver.findElement(ITEMNAME).sendKeys("");
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
        driver.findElement(SUPPLIER1).click();
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
}