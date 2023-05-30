package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {
    private final By loginEmailProtei = By.cssSelector("#loginEmail");
    private final By loginPassword = By.cssSelector("#loginPassword");
    private final By enterBtn = By.cssSelector("#authButton");
    private final By enterEmailAnketa = By.cssSelector("#dataEmail");
    private final By enterNameAnketa = By.cssSelector("#dataName");
    private final By enterSexAnketa = By.cssSelector("#dataGender");
    private final By enterBtnAnketa = By.cssSelector("#dataCheck12");
    private final By enterRadioBtnAnketa = By.cssSelector("#dataSelect22");
    private final By submitAnketa = By.cssSelector("#dataSend");
    private final By searchFld = By.xpath("//div[text()='Данные добавлены.']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void provideLogin(String txt){
        driver.findElement(loginEmailProtei).sendKeys(txt);
    }

    public void providePassword(String txt){
        driver.findElement(loginPassword).sendKeys(txt);
    }

    public void DostypkAnkete() {
        driver.findElement(enterBtn).click();
    }

    public void provideEmail(){
        driver.findElement(enterEmailAnketa).sendKeys("test@protei.ru");
    }

    public void provideName(){
        driver.findElement(enterNameAnketa).sendKeys("Tester");
    }
    public void enterSex(){
        driver.findElement(enterSexAnketa).click();
    }
    public void chooseBtn(){
        driver.findElement(enterBtnAnketa).click();
    }
    public void chooseRadioBtn(){
        driver.findElement(enterRadioBtnAnketa).click();
    }
    public void submitApplication(){
        driver.findElement(submitAnketa).click();
    }

    public boolean isDataUpdated() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchFld)).isDisplayed();
    }
}
