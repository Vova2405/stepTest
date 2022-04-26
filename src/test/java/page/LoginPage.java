package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    String SITE_URL = "http://localhost:8080";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By loginButton = By.cssSelector("[class=\"input-group-btn\"]");

    public void goTo() {
        driver.get(SITE_URL);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
