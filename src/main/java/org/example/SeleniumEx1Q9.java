package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumEx1Q9 {

    private String baseURL;
    private WebDriver driver;


    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        baseURL="https://the-internet.herokuapp.com/dynamic_loading";
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }
    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
   String x=driver.findElement(By.id("content")).getText();
    System.out.print(x);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();


    }

}
