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

//Assert Main Page Carousel
        String resultMainCarousel = this.driver.findElement(By.className("col-md-12")).getText();
        Assert.assertEquals(resultMainCarousel,"HOME");
        this.driver.findElement(By.className("right carousel-control visible-lg visible-md")).click();
        this.driver.get("https://www.phptravels.net/");




    }

//    //DELAY Until closing
//    try {
//        Thread.sleep(2700);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
//    //DELAY-END


}