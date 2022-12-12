import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC3_beforeTest_afterTest {

    WebDriver driver;

    @BeforeTest
    public void prepare() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        Thread.sleep(3000);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void openWebsite() {
        System.out.println(("Let's open the browser"));
        driver.navigate().to("https://www.google.com");
    }
}
