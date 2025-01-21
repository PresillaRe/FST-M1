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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CRM_Activity7 {
 
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
		  String homePageUrl=driver.getCurrentUrl();
		  Assert.assertTrue(homePageUrl.contains("Home"), "Login failed");
	  }
	  @Test(priority=2)
	  public void salesItemTest() throws InterruptedException {
		  driver.manage().window().maximize();
		 
		  //find the sales item and click it
		
		driver.findElement(By.xpath("//a[text()='Sales']")).click();
		 //find the leads item and click it
	 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		 Thread.sleep(1000);
		 // find  the  additional details icon from the table
	     driver.findElement(By.xpath("(//span[(@class='suitepicon suitepicon-action-info')])[1]")).click();
	     Thread.sleep(1000);
		
	     // find the mobile number on popup and print it
	     WebElement popupElement= driver.findElement(By.xpath("//span[@class='phone']"));
	     String mobile=popupElement.getText();
	
	      
	      System.out.println("Mobile Number is:"+ mobile);
	      Assert.assertNotNull(mobile,"Mobile number cannot be null");
		
	  }
	  @AfterClass
	  public void tearDown() {
	  //quit the browser
	  driver.quit();
	  }
	


}
