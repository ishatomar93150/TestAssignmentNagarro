package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartingClass {
	String path ="C:\\Users\\ishatomar\\Downloads\\TestingProject-master\\TestingProject-master\\Resources\\Config.Properties";
	public static Properties property = new Properties();
	
    public static WebDriver driver;
    public static FileInputStream fileStore = null;
    
    public static String configPath = "C:\\Users\\ishatomar\\Downloads\\TestingProject-master\\TestingProject-master\\Resources\\Config.Properties";
    
    static {
        try{
            fileStore = new FileInputStream(configPath);
            property.load(fileStore);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
    @BeforeSuite
    public void InitializeDriver() throws InterruptedException
    {
    	
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get(property.getProperty("url"));
        
        String pageTitle = driver.getTitle();
        
        System.out.println("Title of the page is: "+pageTitle);
        System.out.println("Home Page Open");
    }	
    
//    @AfterSuite
//    public void QuitDriver()
//    {
//    	driver.quit();
//    }
}
