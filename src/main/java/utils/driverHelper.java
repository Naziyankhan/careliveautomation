package utils;

import org.openqa.selenium.WebDriver;

public  class driverHelper {
   static WebDriver driver ;

   public static void setDriver(WebDriver testDriver){
       driver = testDriver;
   }

    public static WebDriver getDriver(){
        return driver;
    }

}
