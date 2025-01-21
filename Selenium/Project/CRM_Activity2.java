package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;

public class CRM_Activity2 {
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
	  public void headerUrlTest() {
		  //find the header image
		 WebElement header= driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
		 String imageURL=header.getDomAttribute("src");
		 //to print the URL of the header image in console
		  System.out.println("Header image URL is: " + imageURL);
		assertEquals(imageURL,"themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g");
	  }
	 

	  @AfterClass
	  public void tearDown() {
		  //quit the browser
		  driver.quit();
	  }

	}


