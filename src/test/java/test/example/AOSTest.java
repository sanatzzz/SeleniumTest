import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;  
public class AOSTest {
    @Test
    public void login() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.advantageonlineshopping.com/#/");
        Thread.sleep(5000);
        WebElement profile =driver.findElement(By.id("menuUser"));
        profile.click();
        Thread.sleep(4000);
        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        username.sendKeys("admin");
        password.sendKeys("adm1n");
        WebElement login=driver.findElement(By.id("sign_in_btn"));
          login.click();
        //String actualUrl="https://live.browserstack.com/dashboard";
        //String expectedUrl= driver.getCurrentUrl();
        // Assert.assertEquals(expectedUrl,actualUrl);
    }
}
