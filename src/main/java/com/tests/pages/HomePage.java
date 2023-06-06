package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    static By Master = By.xpath("//span[contains(text(),'Master')]");
    public  static void clickOnMaster(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Master).click();
        Thread.sleep(500);
    }
}
