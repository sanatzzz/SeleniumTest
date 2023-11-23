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
        driver.get("http://nimbusserver.aos.com:8000/#/");
        Thread.sleep(5000);
        WebElement profile =driver.findElement(By.id("menuUser"));
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.name("sign_in_btnundefined"));
        profile.click();
        username.sendKeys("admin");
        password.sendKeys("adm1n");
          login.click();
        //String actualUrl="https://live.browserstack.com/dashboard";
        //String expectedUrl= driver.getCurrentUrl();
        // Assert.assertEquals(expectedUrl,actualUrl);
    }
}