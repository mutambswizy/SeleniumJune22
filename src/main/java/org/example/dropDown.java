package org.example;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By; import
        org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class dropDown
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.istqb.in");
        Actions actions=new Actions(driver);
        WebElement menu = driver.findElement(By.linkText("FOUNDATION"));
        actions.moveToElement(menu).perform();
        WebElement submenu1=driver.findElement(By.linkText("REGISTRATION"));
        actions.moveToElement(submenu1).perform();
        WebElement submenu2 = driver.findElement(By.linkText("CorporateRegistration"));
        actions.moveToElement(submenu2).perform();
        driver.findElement(By.linkText("Online Registration")).click();
    }
}