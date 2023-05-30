package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    public WebDriver initializeDriver(){
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
