package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestPackage.StartingClass;

public class SearchProductPage extends StartingClass {
public WebDriver driver;
	
	public SearchProductPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SearchItem() {
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Smart Watch");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		System.out.println("Product is displayed scuccessfully.....");
	}
}
