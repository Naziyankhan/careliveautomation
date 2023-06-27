package com.tests.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AddGRNPage {
    static By updatedtotal = By.xpath("//div[contains(@class, 'col-md-4') and contains(@style, 'text-align: right; padding-left: 0; margin-top: 7px;')]");
    static By removebutton = By.xpath("//tbody/tr[2]/td[11]/button[2]/i[1]");
    static  By initaltotal = By.xpath("//div[contains(@class, 'col-md-4') and contains(@style, 'text-align: right')]");
    static  By errormessage = By.xpath("//div[@class='mat-form-field-hint-wrapper ng-tns-c96-45 ng-trigger ng-trigger-transitionMessages ng-star-inserted");
    static By CGST = By.id("txtCgst");
    static By SGST = By.id("txtSgst");
    static By SUPPLIER = By.name("supplier");
    static By BILLNO = By.id("billNum");
    static By PURCHASETYPE = By.name("purchaseSelected");
    static By COMMERICAL = By.xpath("//span[@class='mat-option-text' and text()='Commercial ']");
    static By CONSUMER = By.xpath("//span[@class='mat-option-text' and text()='Consumer ']");
    static By ITEMNAME = By.xpath("//tr[@class='ng-star-inserted'][1]//input[@data-placeholder='Enter item name']");
    static By COUNT = By.id("count");
    static By QTY = By.id("txtQty");
    static By RATE = By.id("txtRate");
    static By RATE2 = By.xpath("//tbody/tr[2]/td[4]/input[1]");
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
    //static  By ADDITEM =By.xpath("//input[contains(@class, 'mat-input-element') and contains(@data-placeholder, 'Enter item name')]");
    static By ADDITEM = By.name("//div[@class='mat-form-field-infix ng-tns-c96-17]");
    static By OKBUTTON = By.xpath("//button[@class='swal2-confirm swal2-styled']");

    static By QTY2 = By.xpath("//tbody/tr[2]/td[3]/input[1]");
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
        Assert.assertTrue(driver.findElement(SAVED).isDisplayed(),"Item was not added successfully");
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
        Thread.sleep(300);

        driver.findElement(ADD).click();
        Thread.sleep(300);
        driver.findElement(ADDITEM).click();
        driver.findElement(ADDITEM).sendKeys("screen");
        Thread.sleep(300);
        driver.findElement(ITEM2).click();
        Thread.sleep(200);
        driver.findElement(QTY2).clear();
        driver.findElement(QTY2).sendKeys("10");
        driver.findElement(RATE).clear();
        driver.findElement(RATE).sendKeys("100");
        driver.findElement(BATCH).click();
        driver.findElement(SAVE1).click();
        driver.findElement(SAVE).click();
        Assert.assertTrue(driver.findElement(SAVED).isDisplayed(), "Item was not added successfully");
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
            Assert.assertTrue(driver.findElement(SAVED).isDisplayed(), "");
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
        driver.findElement(SUPPLIER).sendKeys("Matr");
        Thread.sleep(300);
        driver.findElement(SUPPLIER1).click();
        driver.findElement(BILLNO).sendKeys("102");
        driver.findElement(PURCHASETYPE).click();
        driver.findElement(COMMERICAL).click();
        driver.findElement(ITEMNAME).sendKeys("screen");
        driver.findElement(ITEM2).click();
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

        driver.findElement(SAVED).click();
        //driver.findElement(SAVE).click();
      //  int countAfterAdding = Integer.parseInt(driver.findElement(COUNT).getText());
       //Assert.assertEquals();
    }

    public static void validation(WebDriver driver)
    {
            driver.findElement(SUPPLIER).clear();
            driver.findElement(SUPPLIER).sendKeys("");
            driver.findElement(SAVE).click();
            Assert.assertTrue(driver.findElement(errormessage).isDisplayed(),"Validation error message is not displayed.");
    }

     public static void amount(WebDriver driver) throws InterruptedException {
         driver.findElement(SUPPLIER).sendKeys("Matrix");
         Thread.sleep(300);
         driver.findElement(SUPPLIER1).click();
         Thread.sleep(300);
         driver.findElement(BILLNO).sendKeys("301");
         driver.findElement(PURCHASETYPE).click();
         driver.findElement(CONSUMER).click();

         driver.findElement(ITEMNAME).sendKeys("screen");
         driver.findElement(ITEM).click();
         driver.findElement(QTY).clear();
         driver.findElement(QTY).sendKeys("10");
         driver.findElement(RATE).clear();
         driver.findElement(RATE).sendKeys("100");
         driver.findElement(BATCH).click();
         driver.findElement(SAVE1).click();
        driver.findElement(initaltotal).isDisplayed();

        driver.findElement(ADD).click();
        Thread.sleep(300);
         driver.findElement(ADDITEM).click();
         driver.findElement(ADDITEM).sendKeys("screen");
         Thread.sleep(300);
         driver.findElement(ITEM).click();
         driver.findElement(QTY2).clear();
         driver.findElement(QTY2).sendKeys("10");
         driver.findElement(RATE2).clear();
         driver.findElement(RATE2).sendKeys("100");
         driver.findElement(BATCH).click();
         driver.findElement(SAVE1).click();
        driver.findElement(updatedtotal).getText();
        Assert.assertNotEquals(driver.findElement(initaltotal).isDisplayed() , driver.findElement(updatedtotal).isDisplayed() , "Amount did not change when adding items");

     }
 public static  void amount1(WebDriver driver) throws InterruptedException {
     driver.findElement(SUPPLIER).sendKeys("Matrix");
     Thread.sleep(300);
     driver.findElement(SUPPLIER1).click();
     Thread.sleep(300);
     driver.findElement(BILLNO).sendKeys("1001");
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
  Thread.sleep(300);
  driver.findElement(ADDITEM).sendKeys("screen");
  Thread.sleep(300);
     driver.findElement(ITEM2).click();
     driver.findElement(QTY2).clear();
     driver.findElement(QTY2).sendKeys("10");
     driver.findElement(RATE2).clear();
     driver.findElement(RATE2).sendKeys("100");
     driver.findElement(BATCH).click();
     driver.findElement(SAVE1).click();
     driver.findElement(initaltotal).getText();
     driver.findElement(removebutton).click();
     driver.findElement(updatedtotal).getText();

     Assert.assertEquals(driver.findElement(initaltotal).isDisplayed(), driver.findElement(initaltotal).isDisplayed(),"Amount did not change on remove!");

 }
 public static void finalamount(WebDriver driver)
 {
     driver.findElement(SUPPLIER).sendKeys("Matrix ");
     driver.findElement(SUPPLIER1).click();
     driver.findElement(BILLNO).sendKeys("101");
     driver.findElement(PURCHASETYPE).click();
     driver.findElement(CONSUMER).click();
     driver.findElement(ITEMNAME).sendKeys();
     driver.findElement(ITEM).click();
     driver.findElement(QTY).clear();
     driver.findElement(QTY).sendKeys();
     driver.findElement(RATE).clear();
     driver.findElement(RATE).sendKeys();


 }

}



