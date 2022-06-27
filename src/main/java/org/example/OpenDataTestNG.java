package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenDataTestNG {
    private String baseURL;
    private WebDriver driver;


    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        baseURL="https://datamateinc.com/";
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }
    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
        driver.findElement(By.linkText("Training")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();


    }







}
