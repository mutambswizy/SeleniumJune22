package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenDataJUnit {
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
        driver.findElement(By.linkText("Training")).click();
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/div/ul/li[2]/ul/li[1]/a/span/span")).click();
        Thread.sleep(3000);

        //registration page
        driver.findElement(By.cssSelector("#default-btn-86dfb65d5a95023ba5557de2b61b07ef > span")).click();
        Thread.sleep(2000);
        //register form
        driver.findElement(By.id("wpforms-3337-field_19")).sendKeys("Mr");
        driver.findElement(By.xpath("//*[@id=\"wpforms-3337-field_0\"]")).sendKeys("Wizy");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/section[3]/div/div[1]/div/div/div/div/form/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("Mutambs");
        Thread.sleep(3000);

    }
    @After
    public void CloseBrowser(){
        driver.quit();


    }


}
