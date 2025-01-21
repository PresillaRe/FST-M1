package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CRM_Activity3 {

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
	  public void firstCopyTextTest() {
		  //find the first copyright text in the footer.
		WebElement copyRight=  driver.findElement(By.id("admin_options"));
		//print the text to the console.
		System.out.println( "First copyright text in the footer is:" + copyRight.getText());
		  assertEquals(copyRight.getText(), "© Supercharged by SuiteCRM");
	  }
	 

	  @AfterClass
	  public void tearDown() {
		  //quit the browser
		  driver.quit();
	  }


}
