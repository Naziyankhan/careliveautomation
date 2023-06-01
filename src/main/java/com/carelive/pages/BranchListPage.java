package com.carelive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BranchListPage {
    static By DELETE = By.xpath("//body[1]/app-root[1]/app-full-layout[1]/div[1]/div[1]/div[1]/app-branchlist[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ng2-smart-table[1]/table[1]/tbody[1]/tr[5]/td[7]/ng2-st-tbody-edit-delete[1]/a[1]/i[1]");
    static By EDIT = By.xpath("//body[1]/app-root[1]/app-full-layout[1]/div[1]/div[1]/div[1]/app-branchlist[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ng2-smart-table[1]/table[1]/tbody[1]/tr[3]/td[7]/ng2-st-tbody-custom[1]/a[1]/i[1]");
    static By  BRANCHCODE = By.name("code");
    static By  BRANCHCATEGORY = By.name("branchCategory");
    static By  PRICETEMPLATE = By.name("intPriceTemplate");
    static By ADDRESS =By.name("address");
    static By STATE =By.name("branchState");
    static By EMAIL =By.name("email");
    static By GSTORENUMBER =By.name("mygcareno");
    static By CONTACTNO =By.name("contactId");
    static By GSTNO =By.name("gstNo");
    static By STOCKLIMIT = By.name("branchStockLimit");
    static By LATITUDE =By.name("locationLattitude");
    static By LONGITUDE=By.name("locationLongitude");
    static By SIZE =By.name("branchSize");
    static By STATICIP = By.name("branchStaticIp");
    static By DATE = By.name("inaugurationDate");
    static By INAUGURATEDBY =By.name("inauguratedBy");
    static By QUANTITY = By.name("stockRqstQuantity");
    static By AMOUNT = By.name("stockRqstAmount");
    static By  SPELL= By.xpath("//mat-error[contains(text(),' you must select a price template ')]");
    static By  BRANCHNAME = By.name("branch");
    static By TIME= By.xpath("//mat-form-field//div//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c96-50 ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored");
    static By DELETED = By.xpath("//div[@id='swal2-content']");
    static By DELBUTTON = By.xpath("//button[text()='Yes, Delete it!']");
    static By OK = By.xpath("//button[text()='OK']");
    public static void delete_branch_list(WebDriver driver)
    {
        driver.findElement(DELETE).click();
        driver.findElement(DELETED).click();
        Assert.assertEquals(driver.findElement(DELETED).getText(),"Are you sure want to delete ?","delete message");
        driver.findElement(DELBUTTON).click();
        driver.findElement(OK).click();
    }
    public static void edit_branch_list(WebDriver driver)
    {
        driver.findElement(EDIT).click();
        // driver.findElement(BRANCHCODE).click();
        // Assert.assertEquals(driver.findElement(BRANCHCODE).getText(), "CARE07" ,"data is not found");
        driver.findElement(BRANCHNAME).click();
        Assert.assertEquals(driver.findElement(BRANCHNAME).getText(),"CAREL01" , "data is not found");
        driver.findElement(BRANCHCATEGORY).click();
        Assert.assertEquals(driver.findElement(BRANCHCATEGORY).getText() , "DEFAULT", "DATA IS NOT FOUND");
    }
    public static void branchcode_notmarkedwith_asterisksign(WebDriver driver)
    {
        driver.findElement(EDIT).click();
        driver.findElement(BRANCHCODE).click();
        Assert.assertEquals(driver.findElement(BRANCHCODE).getAttribute("data-placeholder"), "Branch Code*" , "mandatory sign missing");
    }
    public static void inauguration_time(WebDriver driver)
    {
        driver.findElement(EDIT).click();
        driver.findElement(TIME).click();
    }
}

