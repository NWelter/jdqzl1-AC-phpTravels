package Tests;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.hamcrest.core.StringContains;
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
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\chromedriver.exe");
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

    //Assert existence of HotOffers - Virgin Georgia - 1
        String virginGorda = this.driver.findElement(By.cssSelector("div.container:nth-child(2) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h4:nth-child(1) > strong:nth-child(1)")).getText();
    //Assertions: This assertions check if "string pattern" exist in string - virginGorda variable holds this string!
        Assert.assertThat(virginGorda, new StringContains("Virgin Gorda beaches and"));
    //Assert existence of HotOffers - Air Seychelles
        String airLiner = this.driver.findElement(By.cssSelector("div.container:nth-child(2) > a:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).getText();
    //Assertions: This assertion check if string pattern exist in string - airLiner:
        Assert.assertThat(airLiner, new StringContains("Fiercely Independent") );
    //Assert existence of HotOffers - Russia Futbol
        String footBall = this.driver.findElement(By.cssSelector("div.container:nth-child(2) > a:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).getText();
    //Assertions: This assertion check if string pattern exist in string footBall:
        Assert.assertThat(footBall, new StringContains("Peace Train"));

    //div.container:nth-child(2) > a:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)

        //DELAY Until closing
        try {
        Thread.sleep(2000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        //DELAY-END


        }


       }