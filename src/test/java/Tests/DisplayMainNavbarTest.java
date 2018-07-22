package Tests;

import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ChromeDrvPathHelper;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class DisplayMainNavbarTest  {

    private WebDriver driver;
    private NavbarHeader navbarHeader;
    private HotelsPage hotelspage;
    private HomePage homePage;
    private FlightsPage flightsPage;
    private ToursPage toursPage;
    private VisaPage visaPage;
    private CarsPage carsPage;
    private OffersPage offersPage;
    private BlogPage blogPage;

    @BeforeClass
    public static void ustawSciezke() {
        //PATH WILL CHANGE BASED ON OS through: util/ChromeDrvPathHelper
        ChromeDrvPathHelper.setChromeDrvPath();
    }

    @Before
    public void setup() {
        this.driver = new ChromeDriver();
        // this.driver.get("https://www.phptravels.net/");
        navbarHeader = new NavbarHeader(driver);
        navbarHeader.openMainPage();
       //TODO find solution for loggers in abstractclass
        // navbarHeader.testLogLevels();
        hotelspage = new HotelsPage(driver);
        homePage = new HomePage(driver);
        flightsPage = new FlightsPage(driver);
        toursPage = new ToursPage(driver);
        visaPage = new VisaPage(driver);
        carsPage = new CarsPage(driver);
        offersPage = new OffersPage(driver);
        blogPage = new BlogPage(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void CloseBrowser() {
        this.driver.quit();
    }


//Assert Logo exist
//    WebElement result1 = this.driver.findElement(By.className("navbar-"));
//    Assert.assertEquals(result1, "navbar-");

    //Assert Home on navbar exist. This assertion checks test, and tries to click object if working, it continues
    //TODO fix test
    @Test
    public void givenThatHomePageLinkExist() {
        navbarHeader.pickHomeElement();
        assertThat(homePage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/");
    }
//        this.driver.get("https://www.phptravels.net/");
//        String resultHome = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[1]/a")).getText();
//        Assert.assertEquals(resultHome, "HOME");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[1]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(),"https://www.phptravels.net/");
//        this.driver.get("https://www.phptravels.net/");

//Assert HOTELS link on navbar exist. This assertion checks test, and tries to click object if working, it continues

    @Test
    public void givenThatHotelsLinkExist() {
        navbarHeader.pickHotelsElement();
        assertThat(hotelspage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/hotels");
    }
//        String resultHotels = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[2]/a")).getText();
//        Assert.assertEquals(resultHotels, "HOTELS");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[2]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(),"https://www.phptravels.net/hotels");
//        this.driver.get("https://www.phptravels.net/");

    //Assert FLIGHTS link on navbar exist. This assertion checks test, and tries to click object if working, it continues
    @Test
    public void givenThatFlightsLinkExist() {
        navbarHeader.pickFlightsElement();
        assertThat(flightsPage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/flights");
    }

//        this.driver.get("https://www.phptravels.net/");
//        String resultFlights = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[3]/a")).getText();
//        Assert.assertEquals(resultFlights, "FLIGHTS");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[3]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.phptravels.net/flights");
//        this.driver.get("https://www.phptravels.net/");


    //Assert TOURS link on navbar exist. This assertion checks test, and tries to click object if working, it continues
    @Test
    public void givenThatToursLinkExist() {
        navbarHeader.pickToursElement();
        assertThat(toursPage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/tours");

//        this.driver.get("https://www.phptravels.net/");
//        String resultTours = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[4]/a")).getText();
//        Assert.assertEquals(resultTours, "TOURS");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[4]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.phptravels.net/tours");
//        this.driver.get("https://www.phptravels.net/");
    }

    //Assert CARS link on navbar exist. This assertion checks test, and tries to click object if working, it continues
    @Test
    public void givenThatCarsLinkExist() {
        navbarHeader.pickCarsElement();
        assertThat(carsPage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/cars");

//        this.driver.get("https://www.phptravels.net/");
//        String resultCars = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[5]/a")).getText();
//        Assert.assertEquals(resultCars, "CARS");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[5]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.phptravels.net/cars");
//        this.driver.get("https://www.phptravels.net/");
    }

    //Assert VISA link on navbar exist. This assertion checks test, and tries to click object if working, it continues
    @Test
    public void givenThatVisaLinkExist() {
        navbarHeader.pickVisaElement();
        assertThat(visaPage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/ivisa");

//        this.driver.get("https://www.phptravels.net/");
//        String resultVisa = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[6]/a")).getText();
//        Assert.assertEquals(resultVisa, "VISA");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[6]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.phptravels.net/ivisa");
//        this.driver.get("https://www.phptravels.net/");
    }

    //Assert Offers link on navbar exist. This assertion checks test, and tries to click object if working, it continues
    @Test
    public void givenThatOffersPageExist() {
        navbarHeader.pickHOffersElement();
        assertThat(offersPage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/offers");

//        this.driver.get("https://www.phptravels.net/");
//        String resultOffers = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[7]/a")).getText();
//        Assert.assertEquals(resultOffers, "OFFERS");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[7]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.phptravels.net/offers");
//        this.driver.get("https://www.phptravels.net/");
    }

    //Assert BLOG link on navbar exist. This assertion checks test, and tries to click object if working, it continues
    @Test
    public void givenThatBlogPageExist() {
        navbarHeader.pickBlogElement();
        assertThat(blogPage.getCurrentUrl()).isEqualTo("https://www.phptravels.net/blog");

//        this.driver.get("https://www.phptravels.net/");
//        String resultBlog = this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[8]/a")).getText();
//        Assert.assertEquals(resultBlog, "BLOG");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[8]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.phptravels.net/blog");
//        this.driver.get("https://www.phptravels.net/");
//        //DELAY Until closing
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }



//    @Test
//    public void givenThahtHotelsPageExist() {
//        this.driver.get("https://www.phptravels.net/");
//        String assertHotels = this.driver.findElement(By.cssSelector("li.main-lnk:nth-child(2) > a:nth-child(1)")).getText();
//        Assert.assertEquals(assertHotels, "HOTELS");
//        this.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[2]/a")).click();
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.phptravels.net/hotels");
//        this.driver.get("https://www.phptravels.net/");
//        //DELAY Until closing
//        try {
//            Thread.sleep(1750);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //DELAY-END

    }

