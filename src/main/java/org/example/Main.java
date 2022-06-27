package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://datamateinc.com/");
        driver.findElement(By.linkText("Training")).click();
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/div/ul/li[2]/ul/li[1]/a/span/span")).click();


        driver.findElement(By.cssSelector("#default-btn-86dfb65d5a95023ba5557de2b61b07ef > span")).click();
        //Thread.sleep(2000);
        //register form
        driver.findElement(By.id("wpforms-3337-field_19")).sendKeys("Mr");
        driver.findElement(By.xpath("//*[@id=\"wpforms-3337-field_0\"]")).sendKeys("Wizy");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/section[3]/div/div[1]/div/div/div/div/form/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("Mutambs");



        driver.findElement(By.xpath("//*[@id=\"wpforms-3337-field_15-container\"]/div")).click();
        String str= "//*[@id=\"wpforms-3337-field_15-container\"]/div/div[2]/input";
       /*//List<WebElement> options =driver.findElement(By.id("5"));
        for(WebElement option: options){
        String OptionText=option.getText();
        if(OptionText.equals("Zimbabwe")){
            option.click();
            break;
        }
        }*/

    }


    }

