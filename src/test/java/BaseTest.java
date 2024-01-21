import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {protected WebDriver driver;
    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("https://demoqa.com/automation-practice-form/");
        }
    @After
    public void teardown() {
        driver.quit();
}}
