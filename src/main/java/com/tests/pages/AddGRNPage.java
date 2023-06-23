package com.tests.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AddGRNPage {
    static By SUPPLIER = By.name("supplier");
    static By BILLNO = By.id("billNum");
    static By PURCHASETYPE = By.name("purchaseSelected");
    static By COMMERICAL = By.xpath("//span[@class='mat-option-text' and text()='Commercial ']");
    static By CONSUMER = By.xpath("//span[@class='mat-option-text' and text()='Consumer ']");
    static By ITEMNAME = By.id("mat-input-15");
    static By QTY = By.id("txtQty");
    static By RATE = By.id("txtRate");
    static By BATCH = By.id("idImei");
    static  By IMEI = By.id("idImei");
   // Data saved successfully
    static By ENTERIMEI = By.xpath("//input[@placeholder='Imei']");
    static By SAVE1 = By.xpath("//button[@class='btn btn-default m-r-10']");
    static By SAVE = By.xpath("//button[@class='mt-3 btn save_btn m-r-10']");
    static  By Modal = By.xpath("//div[@class='col-md-12']");
    static By SUPPLIER1 = By.xpath("//span[contains(text(),' SUP011-The Matrix Infotech Paradigms It ')]");
    static By ITEM = By.xpath("//span[contains(text(),' SRVS2636-Redmi 9 Power Screen Guard ')]");
    static By SUCCESSMSG = By.id("swal2-content");
    static By ITEM2 = By.xpath("//span[contains(text(),' SRVS2633-Realme C3 Screen Guard ')]");
    static By SAVED =By.xpath("//button[contains(@class, 'swal2-confirm')]");
    static By ADD =By.id("add_button");
    static By ITEM1 = By.xpath("//span[contains(text(),' SMTV0079-Led Tv Samsung Ua32T4010Arxxl (Foc) ')]");
    static  By ADDITEM =By.xpath("//div[@class='mat-form-field-flex ng-tns-c96-16']");
    static By OKBUTTON = By.xpath("//button[@class='swal2-confirm swal2-styled']");
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
        driver.findElement(QTY).clear();
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).clear();
        driver.findElement(RATE).sendKeys("150");
        driver.findElement(BATCH).click();
        driver.findElement(Modal).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        driver.findElement(SAVED).click();
        Assert.assertTrue(driver.findElement(SAVED).isDisplayed());
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
        driver.findElement(RATE).clear();
        driver.findElement(RATE).sendKeys("38000");
        driver.findElement(IMEI).click();
        driver.findElement(ENTERIMEI).sendKeys("12345667");
        driver.findElement(ENTERIMEI).sendKeys(Keys.ENTER);
        driver.findElement(SAVE1).click();

        driver.findElement(ADD).click();

        Thread.sleep(200);
        driver.findElement(ADDITEM).click();
        Thread.sleep(500);

        driver.findElement(ADDITEM).sendKeys("Screen");
        Thread.sleep(200);
        driver.findElement(ITEM).click();
        driver.findElement(QTY).clear();
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).clear();
        driver.findElement(RATE).sendKeys("150");
        driver.findElement(BATCH).click();
       // driver.findElement(IMEI).click();
        driver.findElement(IMEI).sendKeys("123456789");


        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        driver.findElement(SAVED).click();

        Assert.assertTrue(driver.findElement(SAVED).isDisplayed(), "GRN should be saved successfully");
    }
        public static void Sameitem (WebDriver driver) throws InterruptedException {

            driver.findElement(SUPPLIER).sendKeys("Matrix");
            Thread.sleep(300);
            driver.findElement(SUPPLIER1).click();
            Thread.sleep(300);
            driver.findElement(BILLNO).sendKeys("4586");
            driver.findElement(PURCHASETYPE).click();
            driver.findElement(COMMERICAL).click();

            driver.findElement(ITEMNAME).sendKeys("screen");
            driver.findElement(ITEM).click();
            driver.findElement(QTY).clear();
            driver.findElement(QTY).sendKeys("10");
            driver.findElement(RATE).clear();
            driver.findElement(RATE).sendKeys("100");
            driver.findElement(BATCH).click();
            driver.findElement(SAVE1).click();
            driver.findElement(ADD).click();

            driver.findElement(ITEMNAME).click();
            driver.findElement(ITEM).click();

            driver.findElement(QTY).sendKeys("10");
            driver.findElement(RATE).sendKeys("100");
            driver.findElement(BATCH).click();
            driver.findElement(SAVE1).click();

            driver.findElement(SAVE).click();
            Assert.assertTrue(driver.findElement(SAVE).isDisplayed(), "");

        }
    public static void successmsg (WebDriver driver) throws InterruptedException {
        driver.findElement(SUPPLIER).sendKeys("Matrix");
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).click();
        driver.findElement(BILLNO).sendKeys("505");

        driver.findElement(PURCHASETYPE).click();
        driver.findElement(CONSUMER).click();
        driver.findElement(ITEMNAME).sendKeys("Screen");
        Thread.sleep(200);
        driver.findElement(ITEM2).click();
        driver.findElement(QTY).clear();
        driver.findElement(QTY).sendKeys("10");
        driver.findElement(RATE).clear();
        driver.findElement(RATE).sendKeys("100");
        driver.findElement(BATCH).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        driver.findElement(SAVED).click();

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