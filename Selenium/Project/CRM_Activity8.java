package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CRM_Activity8 {
 
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
		  driver.manage().window().maximize();
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
	  public void accountsItemTest() throws InterruptedException {
		 
		  //find the sales item and click it
			
			driver.findElement(By.xpath("//a[text()='Sales']")).click();
		 //find the accounts item and click it
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		 Thread.sleep(1000);
		 String accountPage= driver.findElement(By.xpath("//h2[@class='module-title-text']")).getText().strip();
		assertEquals(accountPage,"ACCOUNTS");
	      System.out.println("Mobile Number is:"+ accountPage);
		
	  }
	  @Test(priority=3)
	  public void oddNumberedRowsTest()throws InterruptedException {
		  //locate all rows of the table
		  // Print the number of   columns 
		  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr"));
	       // System.out.println("Number of rows: " + rows.size());	
		// Iterate through the rows and get the names from odd-numbered rows
		  //// Start from 0 index ,increment by 2
	        for (int i = 0; i < rows.size(); i += 2) { 
	        	// get only  the first 5 odd-numbered rows
	            if (i / 2 < 5) { 
	            	
	                WebElement row = rows.get(i);
	                // find  the name  in the first cell (td) of each row
	                String name = row.findElement(By.xpath("td[3]")).getText();
	                System.out.println("Name in odd-numbered row " + (i + 1) + ": " + name);
	            } else
	            {
	                break;
	            }
	        }
	    	
	  }
	
	 
	  @AfterClass
	  public void tearDown() {
		  //quit the browser
		  driver.quit();
  }

}
