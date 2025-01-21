package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CRM_Activity4 {
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
		  public void pageLoginTest() {
			  //find the username and type in the username
			  driver.findElement(By.id("user_name")).sendKeys("admin");
			  //find the passwrd filed and type in the passwrd
			  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			  
			  
			  //find the Log in button and click it
			  driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
			  
			 
			  //Verify that the homepage has opened.
			  String homePageUrl=driver.getCurrentUrl();
			  Assert.assertTrue(homePageUrl.contains("Home"), "Login failed");
		  }
		 

		  @AfterClass
		  public void tearDown() {
			  //quit the browser
			  driver.quit();
		  }


}
