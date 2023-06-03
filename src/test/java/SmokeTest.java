import com.carelive.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmokeTest {

    static WebDriver driver;
    @BeforeTest
    public void lanuchLogin() throws InterruptedException {

        //   WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
////        System.setProperty("webdriver.chrome.driver", "C:\\Java eclipse\\chromedriver\\chromedriver.exe");
////        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
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
    public static void verifygst() throws InterruptedException
    {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifygst(driver);
    }
    @Test
    public static void verifyservicenumber() throws InterruptedException
    {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyservicenumber(driver);
    }
    @Test
    public static void verifylatitude() throws InterruptedException
    {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifylatitude(driver);
    }
    @Test
    public static void verifyLongitude() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifylongitude(driver);
    }
    @Test
    public static void verifystaticip() throws InterruptedException
    {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifystaticip(driver);
    }
    @Test
    public static void verifyLatitudelabel() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.verifyLatitudelabel(driver);
    }
    @Test
    public static void delete() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonbranchlist(driver);
        BranchListPage.delete_branch_list(driver);
    }
    @Test
    public static void edit() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonbranchlist(driver);
        BranchListPage.edit_branch_list(driver);
    }
    @Test
    public static void branchcode() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonbranchlist(driver);
        BranchListPage.branchcode_notmarkedwith_asterisksign(driver);
    }
    @Test
    public static void time() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonbranchlist(driver);
        BranchListPage.inauguration_time(driver);
    }
    @Test
    public static void save_already_deleted_data() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.save_details(driver);
    }
    @Test
    public static void spelling_error() throws InterruptedException {
        HomePage.clickOnMaster(driver);
        MasterPage.clickonAddbranch(driver);
        AddbranchPage.branch_already_exist(driver);
    }

  @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
