package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://google.com");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	

}