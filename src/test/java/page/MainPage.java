package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }
    By text = By.xpath("//*[text()=\"New plan\"]");
    By keywordsButton = By.xpath("//a[text()=\" Keywords\"]");
    By newKeywordsButton = By.xpath("//*[text()=\"New keyword\"]");
    By scopeText = By.xpath("//*[text()=\"Scope\"]");
    By paramsButton = By.xpath("//*[text()=\" Parameters\"]");
    By schedulerButton = By.xpath("//*[text()=\" Scheduler\"]");
    By newTaskButton = By.xpath("//*[text()=\"New task\"]");


    public void checkText() {
        isElementDisplayed(text);
    }
    public void clickKeywordButton() {
        click(keywordsButton);
    }
    public void newKeywordIsVisible() {
        isElementDisplayed(newKeywordsButton);
    }
    public void clickParamsButton() {
        click(paramsButton);
    }
    public void scopeIsVisible() {
        isElementDisplayed(scopeText);
    }
    public void clickSchedulerButton() {
        click(schedulerButton);
    }
    public void newTaskButtonIsVisible() {
        isElementDisplayed(newTaskButton);
    }



}
