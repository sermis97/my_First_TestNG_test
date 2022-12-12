import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TC5_prioirtyParameter {
WebDriver driver;
@BeforeTest
public void prepare() throws InterruptedException {
    WebDriverManager.firefoxdriver().setup();
    driver =new FirefoxDriver();
    Thread.sleep(3000);
}
@AfterTest
public void tearDown(){
    driver.quit();
}
    @Test
    public void openBrowser() {
        System.out.println(("Let's open the browser"));
    }
    @Test(priority = 1)
    public void  signUp() {
        System.out.println(("Signing up"));
    }
    @Test(priority = 2)
    public void login() {
        System.out.println(("Logging in"));
    }
    @Test(priority = 3)
    public void addToCart() {
        System.out.println(("Add items to cart"));

    }

}
  /*
  PS: The results get listed according to the alphabetic orders in Default Suite
  ****Default Suite consists of
            1. my_First_TestNG_test
            2.TC2_openBrowser
            3.addToCart
            4.closeBrowser
            5.logOut
            6.login
            7.openBrowser
            8.signUp
   */