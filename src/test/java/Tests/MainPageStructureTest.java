package Tests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class MainPageStructureTest {

    private WebDriver driver;

    @BeforeClass
    public static void pathSetup() {
//CHANGE PATH TO THE CHROMEDRIVER AS NEEDED - AND RE-RUN TESTS
        System.setProperty("webdriver.chrome.driver", "C:\\Github\\jdqzl1-materialy\\jdqzl1-selenium\\src\\test\\java\\resources\\chromedriver.exe");
    }

    @Before
    public void setup() {
        this.driver = new ChromeDriver();
    }

    @After
    public void CloseBrowser() {
        this.driver.quit();
    }

    @Test
    public void givenThatPageOpens() {
        //OPEN PAGE TO WORK ON IT
        this.driver.get("https://www.phptravels.net/");

//Assert Main Page Carousel - FIRST CLICK
        String resultMainCarousel = this.driver.findElement(By.className("col-md-12")).getText();
      //  Assert.assertEquals(resultMainCarousel,"HOME");
        this.driver.findElement(By.xpath("/html/body/div[4]/section/div[1]/div/div/a[2]/span[1]")).click();
        this.driver.get("https://www.phptravels.net/");
//WAIT 1.3 sec
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//--------------------------------------------------------------------------------------------------------------
//Assert Main Page Carousel - SECOND CLICK
        String resultMainCarousel2 = this.driver.findElement(By.className("col-md-12")).getText();
        //  Assert.assertEquals(resultMainCarousel,"HOME");
        this.driver.findElement(By.xpath("/html/body/div[4]/section/div[1]/div/div/a[2]/span[1]")).click();
        this.driver.get("https://www.phptravels.net/");
//WAIT 1.3 sec
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//------------------------------------------------------------------------------------------------------------

//Assert Main Page Carousel - THIRD CLICK
        String resultMainCarousel3 = this.driver.findElement(By.className("col-md-12")).getText();
        //  Assert.assertEquals(resultMainCarousel,"HOME");
        this.driver.findElement(By.xpath("/html/body/div[4]/section/div[1]/div/div/a[2]/span[1]")).click();
        this.driver.get("https://www.phptravels.net/");
//WAIT 1.3 sec.
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        //DELAY Until closing
        try {
            Thread.sleep(2700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}