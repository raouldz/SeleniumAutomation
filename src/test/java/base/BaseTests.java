package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

public class BaseTests {
    private WebDriver driver;
@Test
    public void setUp(){
System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
driver = new ChromeDriver();
//Je me rends sur l'url de test
driver.get("https://hightest.nc/");
Thread.sleep(3000);

//cliquer sur "Toolbox"
        WebElement Toolbox = driver.findElement(By.xpath("//a[contains(text(),'Toolbox')]"));
        Toolbox.click();
        Thread.sleep(3000);
//cliquer puis sur le lien vers le quiz ISTQB Fondation en français.
WebElement ISTQBFoundationFrench = driver.findElement(By.xpath("//a[contains(@href, 'https://hightest.nc/ressources/test-istqb.php')]"));
 
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ISTQBFoundationFrench);
Thread.sleep(500); ISTQBFoundationFrench.click();
        Thread.sleep(3000)
// Réaliser le test en cliquant sur les bonnes réponses,
WebElement Reponse0 = driver.findElement(By.xpath("//input"));
        Reponse0.click();
        Thread.sleep(3000)
		
WebElement Reponse1 = driver.findElement(By.xpath("//div[2]/input[2]"));
        Reponse1.click();
        Thread.sleep(3000)
WebElement Reponse2 = driver.findElement(By.xpath("//div[3]/input"));
        Reponse2.click();
        Thread.sleep(3000)
WebElement Reponse3 = driver.findElement(By.xpath("//div[4]/input[2]"));
        Reponse3.click();
        Thread.sleep(3000)
WebElement Reponse4 = driver.findElement(By.xpath("////div[4]/input[2]"));
        Reponse4.click();
        Thread.sleep(3000)
WebElement Reponse5 = driver.findElement(By.xpath("//div[6]/input[3]"));
        Reponse5.click();
        Thread.sleep(3000)
WebElement Reponse6 = driver.findElement(By.xpath("//div[7]/input[2]"));
        Reponse6.click();
        Thread.sleep(3000)
WebElement Reponse7 = driver.findElement(By.xpath("//div[8]/input[4]"));
        Reponse7.click();
        Thread.sleep(3000)
WebElement Reponse8 = driver.findElement(By.xpath("//div[9]/input"));
        Reponse8.click();
        Thread.sleep(3000)
WebElement Reponse9 = driver.findElement(By.xpath("//div[10]/input[3]"));
        Reponse9.click();
        Thread.sleep(3000)
WebElement Reponse10 = driver.findElement(By.xpath("//div[11]/input[4]"));
        Reponse10.click();
        Thread.sleep(3000)
WebElement Reponse11 = driver.findElement(By.xpath("//input[@name='11'])[2]"));
        Reponse11.click();
        Thread.sleep(3000)
WebElement Reponse12 = driver.findElement(By.xpath("//input[@name='12'])[3]"));
        Reponse12.click();
        Thread.sleep(3000)
WebElement Reponse13 = driver.findElement(By.xpath("//input[@name='13'])[2]"));
        Reponse13.click();
        Thread.sleep(3000)
WebElement Reponse14 = driver.findElement(By.xpath("//input[@name='14'])[4]"));
        Reponse14.click();
        Thread.sleep(3000)
WebElement Reponse15 = driver.findElement(By.xpath("//input[@name='15'])[3]"));
        Reponse15.click();
        Thread.sleep(3000)
WebElement Reponse16 = driver.findElement(By.xpath("//input[@name='16'])[3]"));
        Reponse16.click();
        Thread.sleep(3000)
WebElement Reponse17 = driver.findElement(By.xpath("//div[@id='main_content']/form/div[18]/input"));
        Reponse17.click();
        Thread.sleep(3000)
WebElement Reponse18 = driver.findElement(By.xpath("//input[@name='18'])[2]");
        Reponse18.click();
        Thread.sleep(3000)
WebElement Reponse19 = driver.findElement(By.xpath("//input[@name='19'])[2]"));
        Reponse19.click();
        Thread.sleep(3000)
		
//valider le test. Sur la page d'après,		
WebElement ReponseSubmit = driver.findElement(By.xpath("//input[@id='submit']"));
        ReponseSubmit.click();
        Thread.sleep(3000)
// entrer une adresse e-mail Yopmail et valider le formulaire. Se rendre ensuite sur Yopmail,		
WebElement UserMail = driver.findElement(By.xpath("//input[@id='email']"));
        UserMail.sendKeys("raoul@mail.fr");
        Thread.sleep(3000)		

WebElement SendMail = driver.findElement(By.xpath("//input[@id='email']"));
        SendMail.click();
        Thread.sleep(3000)				
 
//consulter les mails et vérifier que le mail reçu indique bien 100 % de bonnes réponses.


	}
public static void main(String args[]){
BaseTests test = new BaseTests();
test.setUp();
    }
}
