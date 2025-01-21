package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CRM_Activity6 {
 
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
	  @Test(priority=2)
	  public void activitiesMenuTest() {
		 
		  //find the navigation menu
		
		driver.findElement(By.className("desktop-toolbar"));
		//adding wait  to load the navigation menu.
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		 
		 
		 //find AND Ensure that the “Activities” menu item exists. 
		 // WebElement activitiesMenu=driver.findElement(By.xpath("//a[contains(text(),'Activities')]"));
		
		  WebElement activitiesMenu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Activities')]")));
		 assertTrue(activitiesMenu.isEnabled());
		 assertTrue(activitiesMenu.isDisplayed());
		System.out.println("Activities Menu is exist");
		    
	  }
	 
	  @AfterClass
	  public void tearDown() {
		  //quit the browser
		  driver.quit();
	  }

	

}
