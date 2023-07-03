package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GRNListPage {

    static By DATEFROM = By.name("dateFrom");
    static By clickfrom =By.id("fromId");
    static By clickto = By.id("toId");
    static By DATETO = By.name("dateTo");
    static  By FROM = By.xpath("//td[@class='mat-calendar-body-cell ng-star-inserted' and @aria-label='19 June 2023']");
    static By TO = By.xpath("//div[@class='mat-calendar-body-cell-content' and text()='28']");
    static By SEARCH = By.xpath("//button[@type='submit']");
    static By ITEM = By.xpath("//div[@class='ng-star-inserted'and text()='22-GRN-WHO1-0037']");
    static By VIEW = By.xpath("//td[@class='ng2-smart-actions ng-star-inserted']");



    public static void list(WebDriver driver) throws InterruptedException {

        driver.findElement(SEARCH).click();
        Assert.assertFalse(driver.findElement(SEARCH).isDisplayed(),"SEARCH button Not working");
    }
    public static void view(WebDriver driver) throws InterruptedException {
        driver.findElement(SEARCH).click();
        Thread.sleep(200);
        driver.findElement(VIEW).click();
        Assert.assertTrue(driver.findElement(VIEW).isDisplayed(),"cant able to click view");
    }
    }
