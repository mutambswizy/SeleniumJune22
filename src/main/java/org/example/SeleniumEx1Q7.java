package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEx1Q7 {
    private String baseURL;
    private WebDriver driver;


    @Before
    public void Setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        baseURL = "https://www.google.com";
        driver.manage().window().maximize();


    }

    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
        //Select element from dropdown
        // Get the page title
        String pageTitle = driver.getTitle();
        // Print the title to console
        System.out.println("The actual title is: " + pageTitle);
        // Check if actual and expected values are equal
        Assert.assertEquals("Google", pageTitle);
        // Printing success message
        System.out.println("Assert equals passed.");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Yahoo");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
        Thread.sleep(4000);


    }

    @After
    public void CloseBrowser() {
        driver.quit();


    }
}