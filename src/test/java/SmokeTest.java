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

public class SmokeTest {

    static WebDriver driver;
    @BeforeTest
    public void lanuchLogin() throws InterruptedException {

        //   WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Java\\Selenium\\chromedriver2\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        LoginPage.login(driver);
    }

    @Test
    public static void addBranch() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
    }

    @Test
    public static void listBranch(){

    }

 //   @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
