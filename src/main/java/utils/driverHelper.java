package utils;

import com.carelive.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public  class driverHelper {
   static WebDriver driver = null;

   public static void setDriver(WebDriver driver){
       driver = driver;
   }
//    public static WebDriver getdriver(){
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver = driver;
//    }
}
