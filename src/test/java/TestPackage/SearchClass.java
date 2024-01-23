package TestPackage;

import org.testng.annotations.Test;

import PageObject.SearchProductPage;

public class SearchClass extends StartingClass {
	
	@Test
	public void SearchPOM() throws InterruptedException 
	{
		SearchProductPage obj = new SearchProductPage(driver);
		obj.SearchItem();
	}
}
