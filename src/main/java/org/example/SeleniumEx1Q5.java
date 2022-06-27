package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEx1Q5 {
    private String baseURL;
    private WebDriver driver;


    @Before
    public void Setup() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        baseURL="https://www.datamate.co.za/registration/";
        driver.manage().window().maximize();


    }
    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
        //Select element from dropdown
        Select dropdown = new Select(driver.findElement(By.id("quform_1_71_01dc94")));
        dropdown.selectByVisibleText("Selenium Automation Testing");
        //GetLabelTitle
        String r= driver.findElement(By.xpath("//*[@id=\"quform-form-01dc94\"]/div/div/div/div/div[1]/div/div[1]/label")).getText();
         System.out.println(r);
        Thread.sleep(4000);



    }
    @After
    public void CloseBrowser(){
        driver.quit();


    }

}
