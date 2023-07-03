package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage {
    static By Purchase = By.xpath("//span[text()='Purchase']");
    static By AddGRN = By.xpath("//span[text()='Add GRN']");
    static By GRNList = By.xpath("//span[text()='GRN List']");


    public static void ClickOnAddGRN(WebDriver driver) throws InterruptedException {
        driver.findElement(Purchase).click();
        Thread.sleep(300);
        driver.findElement(AddGRN).click();

    }
    public static void ClickOnGRNList(WebDriver driver) throws InterruptedException {
        driver.findElement(Purchase).click();
        Thread.sleep(300);
        driver.findElement(GRNList).click();
    }
}
