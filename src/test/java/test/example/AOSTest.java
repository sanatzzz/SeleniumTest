import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class AOSTest {
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        WebDriver driver=new ChromeDriver(options);

        // driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");
        Thread.sleep(5000);
        WebElement username=driver.findElement(By.id("user_email_login"));
        WebElement password=driver.findElement(By.id("user_password"));
        WebElement login=driver.findElement(By.name("commit"));
        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        //   login.click();
        String actualUrl="https://live.browserstack.com/dashboard";
        String expectedUrl= driver.getCurrentUrl();
        // Assert.assertEquals(expectedUrl,actualUrl);
    }
}