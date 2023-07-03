package com.tests.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    static By Master = By.xpath("//span[contains(text(),'Master')]");
    static By TRANSACTION = By.xpath("//span[contains(text(),'Transactions')]");

    public  static void clickOnMaster(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Master).click();
        Thread.sleep(500);
    }

    public static void clickOnTransaction(WebDriver driver) throws InterruptedException {
        Thread.sleep(300);
        driver.findElement(TRANSACTION).click();
        Thread.sleep(500);
    }
}
