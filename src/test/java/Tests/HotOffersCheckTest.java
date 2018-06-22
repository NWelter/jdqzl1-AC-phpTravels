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


public class HotOffersCheckTest {
    private WebDriver driver;

@BeforeClass
    public static void usawSciezke() {
        //CHANGE PATH TO THE CHROMEDRIVER AS NEEDED - AND RE-RUN TESTS
        System.setProperty("webdriver.chrome.driver", "C:\\Github\\jdqzl1-materialy\\jdqzl1-selenium\\src\\test\\java\\resources\\chromedriver.exe");
        }

@Before
    public void setup() {
        this.driver = new ChromeDriver();
        }

@After


@Test
public void GivenThatHotOfferIs() {
        this.driver.get("http://phptravels.net/");
        //Testing logging in


    

        //DELAY Until closing
        try {
        Thread.sleep(2000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        //DELAY-END


        }


       }