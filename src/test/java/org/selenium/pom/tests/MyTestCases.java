package org.selenium.pom.tests;

import org.openqa.selenium.By;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestCases extends BaseTest {
    @Test
    public void loginForm() throws InterruptedException{
        driver.get("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html");

        HomePage homePage = new HomePage(driver);
        homePage.provideLogin("test@protei.ru");
        homePage.providePassword("test");
        homePage.DostypkAnkete();

        homePage.provideEmail();
        homePage.provideName();
        homePage.enterSex();
        homePage.chooseBtn();
        homePage.chooseRadioBtn();
        homePage.submitApplication();

        Assert.assertTrue(homePage.isDataUpdated());
    }
}