package test;

import org.junit.jupiter.api.Test;

public class Basic extends TestBase{





    @Test
    public void firstTest() {
        loginPage.goTo();
        loginPage.clickLoginButton();
        mainPage.checkText();
        mainPage.clickKeywordButton();
        mainPage.newKeywordIsVisible();
        mainPage.clickParamsButton();
        mainPage.scopeIsVisible();
        mainPage.clickSchedulerButton();
        mainPage.newTaskButtonIsVisible();

    }

}
