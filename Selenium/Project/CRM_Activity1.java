package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CRM_Activity1 {
 
//declare WebDriver 
		WebDriver driver;
	  
	  
	  @BeforeClass
	  public void setUp() {
		  //initialize webdriver
		  driver = new ChromeDriver();
		  //open the page
		  driver.get("http://alchemy.hguy.co/crm");
	  }
	 
	  @Test
	  public void pageTitleTest() {
		  //get the page title and assert
		
		  assertEquals(driver.getTitle(), "SuiteCRM");
	  }
	 

	  @AfterClass
	  public void tearDown() {
		  //quit the browser
		  driver.quit();
	  }

}
