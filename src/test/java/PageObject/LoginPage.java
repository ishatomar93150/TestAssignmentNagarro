package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestPackage.StartingClass;

public class LoginPage extends StartingClass {
public WebDriver driver;
	
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    
    public void LoginAmazon() throws InterruptedException{
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(property.getProperty("username"));
        
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(property.getProperty("password"));
        
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

	System.out.println("Successfully Logged In");
    }

}
