import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
public class AOSTest {
    @Test
    public void login() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        //options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        driver=new ChromeDriver();

        // driver.manage().window().maximize();
        driver.get("https://www.advantageonlineshopping.com/#/");
        Thread.sleep(5000);
        WebElement profile =driver.findElement(By.id("menuUser"));
        profile.click();
        Thread.sleep(4000);
        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login=driver.findElement(By.id("sign_in_btnundefined"));
        username.sendKeys("admin");
        password.sendKeys("adm1n");
          login.click();
        //String actualUrl="https://live.browserstack.com/dashboard";
        //String expectedUrl= driver.getCurrentUrl();
        // Assert.assertEquals(expectedUrl,actualUrl);
    }
}
