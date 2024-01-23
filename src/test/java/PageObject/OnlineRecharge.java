package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import TestPackage.StartingClass;

public class OnlineRecharge extends StartingClass {
	
	public WebDriver driver;
	
	public OnlineRecharge(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void Recharge()
	{
		driver.findElement(By.xpath("//a[contains(@href,'/gp/sva/dashboard?ref_=nav_cs_apay')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Recharge')]")).click();
		
		driver.findElement(By.xpath("//input[@id='mobileNumberTextInputId']")).click();
		
		driver.findElement(By.xpath("//input[@id='mobileNumberTextInputId']")).sendKeys("8860919288");
		
		
		
	}
}
