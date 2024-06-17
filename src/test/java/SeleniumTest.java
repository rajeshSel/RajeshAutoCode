import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumTest {

    @Test
    void Setup(){

        System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir") + "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.close();
    }
}