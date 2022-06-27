package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumEx1Q4 {

    private String baseURL;
    private WebDriver driver;


    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        baseURL="http://executeautomation.com/demosite/Login.html";
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }
    @Test
    public void OpenDM() throws InterruptedException {
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"userName\"]/p[1]/input")).sendKeys("wiztech");
        driver.findElement(By.xpath("//*[@id=\"userName\"]/p[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"userName\"]/p[3]/input")).click();
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a/span")).click();

        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"TitleId\"]")));
        dropdown.selectByVisibleText("Mr.");
        driver.findElement(By.xpath("//*[@id=\"Initial\"]")).sendKeys("W");
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("wawa");
        driver.findElement(By.xpath("//*[@id=\"MiddleName\"]")).sendKeys("tata");
        WebElement check1 = driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[5]/td[2]/input[1]"));
        check1.click();
        check1.click();
        WebElement tick1= driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[1]"));
       tick1.click();
        tick1.click();
        driver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[7]/td/input")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("LOGOUT")).click();
        Thread.sleep(4000);
    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();


    }

}
