package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class SeleniumEx1Q6 {

    private String baseURL;
    private WebDriver driver;


    @Before
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseURL = "https://www.agiletestingalliance.org/";
        driver.manage().window().maximize();


    }

    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
        //Select element from dropdown
      driver.findElement(new By.ByPartialLinkText("CONTACT")).click();
      driver.findElement(By.id("wpforms-12474-field_1")).sendKeys("wawa mutambs");
      driver.findElement(By.name("wpforms[fields][2]")).sendKeys("Wawa@gmail.com");
      driver.findElement(By.xpath("//*[@id=\"wpforms-12474-field_3\"]")).sendKeys("073456779");
      driver.findElement(By.xpath("//*[@id=\"wpforms-12474-field_4\"]")).sendKeys("Register for training agile");
      //WebElement check1 = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]"));
        //check1.click();
        //prompting user to enter captcha
        String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
        //Type the entered captcha to the text box
        driver.findElement(By.id("recaptcha-anchor")).sendKeys(captchaVal);

        driver.findElement(By.id("wpforms-submit-12474")).click();
    Thread.sleep(4000);

    }

    @After
    public void CloseBrowser() {
        driver.quit();
    }
}