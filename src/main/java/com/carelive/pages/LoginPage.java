package com.carelive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
  static  By username = By.name("fakeusernameremembered");
    static By password = By.xpath("//input[@type='password']");
static By login = By.xpath("//button[contains(text(),'Login')]");

static By OK  = By.xpath("(//button[text()='OK'])[2]");
    public static void login(WebDriver driver) throws InterruptedException {
        driver.get("http://carelive.bisuite.in:7013/#/login/userlogin");
        WebElement txtUsername = driver.findElement(username);
        txtUsername.sendKeys("TDXADMIN");
        WebElement txtPassword = driver.findElement(password);
        txtPassword.sendKeys("Tdx@2022");
        Thread.sleep(3000);
        driver.findElement(login).click();
        Thread.sleep(3000);
        driver.findElement(OK).click();
    }

}
