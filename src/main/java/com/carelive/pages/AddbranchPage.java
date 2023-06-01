package com.carelive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static java.lang.Boolean.TRUE;


public class AddbranchPage {
    static By BRANCHCODE = By.xpath("//input[@name='code']");
    static By BRANCHNAME = By.xpath("//input[@name='branch']");
    static By BRANCHCATEGORY = By.name("branchCategory");
    static By DEFAULTVALUE = By.xpath("//span[@class='mat-option-text']");
    static By HIERARCHY = By.name("hierarchy");
    static By PRICETEMPLATE = By.name("intPriceTemplate");
    static By HIERARCHYVALUE = By.xpath("//span[contains(text(),'GENERAL-GENERAL')]");
    static By PRICETEMPLATEVALUE = By.xpath("//span[@class='mat-option-text' and text()='COST PRICE']");
    static By ADDRESS = By.name("address");
    static By GST = By.name("gstNo");
    static By PINCODE = By.name("no");
    static By STATE = By.name("branchState");
    static By BRANCHSTATE = By.xpath("//span[contains(text(),'Kerala')]");
    static By EMAIL = By.name("email");
    static By DATE = By.name("inaugurationDate");
    static By SERVICENUMBER = By.name("mygcareno");
    static By CONTACTNO = By.id("mat-input-10");
    static By BRANCHSTOCKLIMIT = By.name("branchStockLimit");
    static By INAUGURATIONDATE = By.xpath("//button[@aria-label='Open calendar']");
    static By INAGURATIONDATEVALUE = By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']");
    static By INAUGURATIONTIME = By.name("inaugurationTime");
    static By INAUGURATEDBY = By.name("inauguratedBy");
    static By CUSTOMER = By.xpath("//label[@for='mat-checkbox-1-input']");
    static By SUPPLIER = By.xpath("//label[@for='mat-checkbox-2-input']");
    static By LATITUDE = By.name("locationLattitude");
    static By LONGITUDE = By.name("locationLongitude");
    static By SIZE = By.name("branchSize");
    static By STATICIP = By.name("branchStaticIp");
    static By QUNATITY = By.name("stockRqstQuantity");
    static By AMOUNT = By.name("stockRqstAmount");
    static By SAVE = By.xpath("//button[contains(text(),'Save')]");
//    static By SAVED = By.xpath("//div[text()='Data saved successfully']");
static By SAVED = By.xpath("//div[@id='swal2-content']");
static By BRACATMESSAGE = By.xpath("//mat-error[text()=' You must select a branch category. ']");


    public static void enterBranchDetails(WebDriver driver) throws InterruptedException {
        driver.findElement(BRANCHCODE).sendKeys("BRAN002");
        driver.findElement(BRANCHNAME).sendKeys("COCHIN");
        driver.findElement(BRANCHCATEGORY).click();
        Thread.sleep(500);
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(HIERARCHY).click();
        Thread.sleep(500);
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(PRICETEMPLATE).click();
        driver.findElement(PRICETEMPLATEVALUE).click();
        Thread.sleep(500);
        driver.findElement(CUSTOMER).click();
        driver.findElement(ADDRESS).sendKeys("OPP. LULU MALL");
        driver.findElement(GST).sendKeys("1234567890");
        driver.findElement(PINCODE).sendKeys("680722");
        driver.findElement(STATE).click();
        Thread.sleep(500);
        driver.findElement(BRANCHSTATE).click();
        driver.findElement(EMAIL).sendKeys("kljh@gmail.com");
        driver.findElement(SERVICENUMBER).sendKeys("123456789");
        Thread.sleep(1000);
        driver.findElement(CONTACTNO).sendKeys("8306785435");
        driver.findElement(BRANCHSTOCKLIMIT).sendKeys("1000000");
        driver.findElement(INAUGURATIONDATE).click();
        Thread.sleep(500);
        driver.findElement(INAGURATIONDATEVALUE).click();
        driver.findElement(INAUGURATIONTIME).sendKeys("10:10");
        driver.findElement(INAUGURATEDBY).sendKeys("MLA");
        driver.findElement(CUSTOMER).click();
        driver.findElement(SUPPLIER).click();
        driver.findElement(LATITUDE).sendKeys("11.543");
        driver.findElement(LONGITUDE).sendKeys("10.087");
        driver.findElement(SIZE).sendKeys("2000");
        driver.findElement(STATICIP).sendKeys("192.168.1.1");
        driver.findElement(QUNATITY).sendKeys("100");
        driver.findElement(AMOUNT).sendKeys("10000");
        driver.findElement(SAVE).click();
        Assert.assertTrue(driver.findElement(SAVED).isDisplayed());


    }

    public static void addbranchwithmandatoryfields(WebDriver driver) throws InterruptedException {
        driver.findElement(BRANCHCODE).sendKeys("BRAN034");
        driver.findElement(BRANCHNAME).sendKeys("TVM");
        driver.findElement(BRANCHCATEGORY).click();
        Thread.sleep(500);
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(HIERARCHY).click();
        Thread.sleep(500);
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(PRICETEMPLATE).click();
        driver.findElement(PRICETEMPLATEVALUE).click();
        driver.findElement(GST).sendKeys("123450965");
        driver.findElement(PINCODE).sendKeys("680122");
        driver.findElement(STATE).click();
        Thread.sleep(500);
        driver.findElement(BRANCHSTATE).click();
        driver.findElement(EMAIL).sendKeys("klQQh@gmail.com");
        driver.findElement(CONTACTNO).sendKeys("8306785435");
        driver.findElement(BRANCHSTOCKLIMIT).sendKeys("10000");
        driver.findElement(INAUGURATIONDATE).click();
        Thread.sleep(500);
        driver.findElement(INAGURATIONDATEVALUE).click();
        driver.findElement(LATITUDE).sendKeys("11.543");
        driver.findElement(LONGITUDE).sendKeys("10.087");
        driver.findElement(SIZE).sendKeys("2000");
        driver.findElement(STATICIP).sendKeys("192.168.1.1");
        driver.findElement(QUNATITY).sendKeys("100");
        driver.findElement(AMOUNT).sendKeys("22000");
        driver.findElement(SAVE).click();

        Assert.assertEquals(driver.findElement(SAVED).getText(), "Data saved successfully", "Data saved successfully");
    }

    public static void verifyMandatoryFields(WebDriver driver) throws InterruptedException {
        driver.findElement(BRANCHCATEGORY).click();
        Thread.sleep(2000);
        driver.findElement(HIERARCHY).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(BRACATMESSAGE).isDisplayed(),TRUE,"Alert displayed");

    }
    public static void calenderinput(WebDriver driver) throws InterruptedException
    {
        driver.findElement(BRANCHCODE).sendKeys("BRANCH020");
        driver.findElement(BRANCHNAME).sendKeys("CARELIVE020");
        driver.findElement(BRANCHCATEGORY).click();
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(HIERARCHY).click();
        driver.findElement(HIERARCHYVALUE).click();
        driver.findElement(PRICETEMPLATE).click();
        driver.findElement(PRICETEMPLATEVALUE).click();
        driver.findElement(GST).sendKeys("142536789");
        driver.findElement(PINCODE).sendKeys("690734");
        driver.findElement(STATE).click();
        Thread.sleep(300);
        driver.findElement(BRANCHSTATE).click();
        driver.findElement(EMAIL).sendKeys("carelive123@gmail.com");
        driver.findElement(CONTACTNO).sendKeys("8302751610");
        driver.findElement(BRANCHSTOCKLIMIT).sendKeys("20000");
        driver.findElement(DATE).sendKeys("24/5/2023");
        driver.findElement(LATITUDE).sendKeys("11.543");
        driver.findElement(LONGITUDE).sendKeys("10.087");
        driver.findElement(SIZE).sendKeys("2000");
        driver.findElement(STATICIP).sendKeys("192.168.1.1");
        driver.findElement(QUNATITY).sendKeys("1000");
        driver.findElement(AMOUNT).sendKeys("10000");
        driver.findElement(SAVE).click();
        Assert.assertEquals(driver.findElement(DATE).getText(), false ,"date ");

    }
    public static void  verifyphonenumber(WebDriver driver) throws InterruptedException
    {
        driver.findElement(BRANCHCODE).sendKeys("CR823");
        driver.findElement(BRANCHNAME).sendKeys("CARE28");
        driver.findElement(BRANCHCATEGORY).click();
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(HIERARCHY).click();
        driver.findElement(HIERARCHYVALUE).click();
        driver.findElement(PRICETEMPLATE).click();
        driver.findElement(PRICETEMPLATEVALUE).click();
        driver.findElement(GST).sendKeys("142536789");
        driver.findElement(PINCODE).sendKeys("690e34");
        driver.findElement(STATE).click();
        Thread.sleep(300);
        driver.findElement(BRANCHSTATE).click();
        driver.findElement(EMAIL).sendKeys("carelive123@gmail.com");
        driver.findElement(CONTACTNO).sendKeys("+91 83027516E110HJKLG");
        driver.findElement(BRANCHSTOCKLIMIT).sendKeys("20E000");
        driver.findElement(INAUGURATIONDATE).click();
        driver.findElement(INAGURATIONDATEVALUE).click();
        driver.findElement(LATITUDE).sendKeys("11.543");
        driver.findElement(LONGITUDE).sendKeys("10.087");
        driver.findElement(SIZE).sendKeys("2000");
        driver.findElement(STATICIP).sendKeys("192.168.1.1");
        driver.findElement(QUNATITY).sendKeys("1000");
        driver.findElement(AMOUNT).sendKeys("10000");
        driver.findElement(SAVE).click();
        Assert.assertEquals(driver.findElement(CONTACTNO).getText(),"+91 8754213692" , "Contact number must allow +, - signs");
    }
    public static void  verifybranchcode(WebDriver driver) throws InterruptedException
    {
        driver.findElement(BRANCHCODE).sendKeys("BRANCH01&*^&&");
        driver.findElement(BRANCHNAME).sendKeys("CARELIVE014");
        driver.findElement(BRANCHCATEGORY).click();
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(HIERARCHY).click();
        driver.findElement(HIERARCHYVALUE).click();
        driver.findElement(PRICETEMPLATE).click();
        driver.findElement(PRICETEMPLATEVALUE).click();
        driver.findElement(GST).sendKeys("142536789");
        driver.findElement(PINCODE).sendKeys("690734");
        driver.findElement(STATE).click();
        Thread.sleep(300);
        driver.findElement(BRANCHSTATE).click();
        driver.findElement(EMAIL).sendKeys("carelive123@gmail.com");
        driver.findElement(CONTACTNO).sendKeys("+91 8302751610HJKLG");
        driver.findElement(BRANCHSTOCKLIMIT).sendKeys("20000");
        driver.findElement(INAUGURATIONDATE).click();
        driver.findElement(INAGURATIONDATEVALUE).click();
        driver.findElement(LATITUDE).sendKeys("11.543");
        driver.findElement(LONGITUDE).sendKeys("10.087");
        driver.findElement(SIZE).sendKeys("2000");
        driver.findElement(STATICIP).sendKeys("192.168.1.1");
        driver.findElement(QUNATITY).sendKeys("1000");
        driver.findElement(AMOUNT).sendKeys("10000");
        driver.findElement(SAVE).click();
        Assert.assertEquals(driver.findElement(BRANCHCODE).getText() , "BRANCH01" , "Branch code must be in alphanumeric");
    }
    public static void verifybranchname(WebDriver driver) throws InterruptedException
    {
        driver.findElement(BRANCHCODE).sendKeys("BRANCH&*^&&");
        driver.findElement(BRANCHNAME).sendKeys("CARE LI#@$$");
        driver.findElement(BRANCHCATEGORY).click();
        driver.findElement(DEFAULTVALUE).click();
        driver.findElement(HIERARCHY).click();
        driver.findElement(HIERARCHYVALUE).click();
        driver.findElement(PRICETEMPLATE).click();
        driver.findElement(PRICETEMPLATEVALUE).click();
        driver.findElement(GST).sendKeys("142536789");
        driver.findElement(PINCODE).sendKeys("690734");
        driver.findElement(STATE).click();
        Thread.sleep(300);
        driver.findElement(BRANCHSTATE).click();
        driver.findElement(EMAIL).sendKeys("carelive123@gmail.com");
        driver.findElement(CONTACTNO).sendKeys("+91 8302751610HJKLG");
        driver.findElement(BRANCHSTOCKLIMIT).sendKeys("20000");
        driver.findElement(INAUGURATIONDATE).click();
        driver.findElement(INAGURATIONDATEVALUE).click();
        driver.findElement(LATITUDE).sendKeys("11.543");
        driver.findElement(LONGITUDE).sendKeys("10.087");
        driver.findElement(SIZE).sendKeys("2000");
        driver.findElement(STATICIP).sendKeys("192.168.1.1");
        driver.findElement(QUNATITY).sendKeys("1000");
        driver.findElement(AMOUNT).sendKeys("10000");
        driver.findElement(SAVE).click();
        Assert.assertEquals(driver.findElement(BRANCHNAME).getText(), "CARE LIVE", "Branch name must be in alphanumeric ");
    }
    }