package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumEx1Q3 {

    private String baseURL;
    private WebDriver driver;


    @Before
    public void Setup() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        baseURL="https://datamateinc.com/";
        driver.manage().window().maximize();


    }
    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
        driver.findElement(By.linkText("About Us")).click();

        Thread.sleep(3000);

    }
    @After
    public void CloseBrowser(){
        driver.quit();


    }


}
