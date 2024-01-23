package TestPackage;

import org.testng.annotations.Test;

import PageObject.OnlineRecharge;

public class Recharge extends StartingClass {
	
	@Test
	public void recharge() throws InterruptedException 
	{
		OnlineRecharge obj = new OnlineRecharge(driver);
		obj.Recharge();
	}

}
