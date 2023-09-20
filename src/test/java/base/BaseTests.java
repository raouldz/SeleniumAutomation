package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions
import static org.testng.Assert.assertEquals;

public class BaseTests {
    private WebDriver driver;
@Test
    public void setUp(){
System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/");
assertEquals(driver.getTitle(), "homepageTitle","Pagetitle incorrect");

	}
public static void main(String args[]){
BaseTests test = new BaseTests();
test.setUp();
    }
}
