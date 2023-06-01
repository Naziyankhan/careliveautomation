package com.carelive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterPage {

    static By BRANCH = By.xpath("//span[text()='Branch']");
    static By ADDBRANCH = By.xpath("//span[contains(text(),'Add Branch')]");
    static By BRANCHLIST =By.xpath("//span[contains(text(),'Branch List')]");
    public static  void clickonAddbranch(WebDriver driver) {
        driver.findElement(BRANCH).click();
        driver.findElement(ADDBRANCH).click();

    }
    public static void clickonbranchlist(WebDriver driver)
    {
        driver.findElement(BRANCH).click();
        driver.findElement(ADDBRANCH).click();
        driver.findElement(BRANCHLIST).click();
    }

}
