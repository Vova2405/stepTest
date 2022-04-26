package test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import page.MainPage;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;
    public MainPage mainPage;
    public LoginPage loginPage;

    @BeforeEach
    public void start () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
