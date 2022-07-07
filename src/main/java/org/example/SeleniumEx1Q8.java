package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumEx1Q8 {
    private String baseURL;
    private WebDriver driver;


    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        baseURL="http://www.onlineconversion.com/length_common.htm";
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }
    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[1]/td/input")).sendKeys("4");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[1]/select/option[4]")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[2]/select/option[7]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[3]/td/input")).click();
  String x=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[4]/td/input")).getAttribute("value");
  System.out.println(x);
  String y= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[1]/td/input")).getAttribute("value");
       System.out.println(y);
  Thread.sleep(3000);
    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();


    }


}
