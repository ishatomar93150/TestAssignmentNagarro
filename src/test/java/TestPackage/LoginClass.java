package TestPackage;

import PageObject.LoginPage;
import org.testng.annotations.*;

public class LoginClass extends StartingClass {
	
	@Test
	 public void LoginPOM() throws InterruptedException{
	        LoginPage login = new LoginPage(driver);
	        login.LoginAmazon();
	    }
	
}
