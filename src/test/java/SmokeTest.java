import com.carelive.pages.AddbranchPage;
import com.carelive.pages.HomePage;
import com.carelive.pages.LoginPage;
import com.carelive.pages.MasterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmokeTest {

    static WebDriver driver;
    @BeforeTest
    public void lanuchLogin() throws InterruptedException {

        //   WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Java\\Selenium\\chromedriver2\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        LoginPage.login(driver);
    }

  @Test
   public static void addBranch() throws InterruptedException {
       HomePage.clickOnMaster(driver);
       MasterPage.clickonAddbranch(driver);
       AddbranchPage.enterBranchDetails(driver);
   }
    @Test
    public static void addBranchwithmandatoryfields() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.addbranchwithmandatoryfields(driver);
    }

    @Test
    public static void verifyMandatorylabels() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyMandatoryFields(driver);
    }
    @Test
    public static void calenderinput() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.calenderinput(driver);
    }

    @Test
    public static void verifyphonenumber() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyphonenumber(driver);
    }
    @Test
    public static void verifybranchcode() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifybranchcode(driver);
    }
    @Test
    public static void verifybranchname() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifybranchname(driver);
    }
    @Test
    public static void listBranch(){

    }

  @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
