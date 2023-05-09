package com.carelive;

import com.carelive.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
     //   WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Java\\Selenium\\chromedriver2\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("http://carelive.bisuite.in:7013/#/login/userlogin");
        String title = driver.getTitle();
        LoginPage.login(driver);
        System.out.println(title);
        driver.quit();
        }
    }
