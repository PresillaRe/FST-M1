package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CRM_Activity5 {
  
//declare WebDriver 
		WebDriver driver;
	  
	  
	  @BeforeClass
	  public void setUp() {
		  //initialize webdriver
		  driver = new ChromeDriver();
		  //open the page
		  driver.get("http://alchemy.hguy.co/crm");
	  }
	 
	  @Test(priority = 1)
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
	  @Test(priority = 2)
	  public void navMenuColorTest() {
		 
		  //find the navigation menu& get the color
		Color navColor= Color.fromString(driver.findElement(By.className("desktop-toolbar")).getCssValue("color"));
		 System.out.println("color of the navigation menu is: " + navColor);
		 Assert.assertEquals(navColor.asHex(), "#534d64");
		
		  
		  
	  }
	

	  @AfterClass
	  public void tearDown() {
		  //quit the browser
		  driver.quit();
	  }


}
