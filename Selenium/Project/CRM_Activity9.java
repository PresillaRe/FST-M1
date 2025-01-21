package crm_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CRM_Activity9 {
 
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
		 String actualPageTitle = driver.findElement(By.className("module-title-text")).getText().strip();
			String expectedPageTitle = "LEADS";
			Assert.assertEquals(actualPageTitle, expectedPageTitle);
}
	  @Test(priority=3)
	  public void nameAndUserNamesTest()throws InterruptedException {
		  //locate all rows of the table
		
		  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr"));
		  // Print the number of   columns 
		  System.out.println("Number of rows: " + rows.size());
		  //iterate 1st 10 rows
		  for (int i = 0; i <=10; i++) { 
	       	
	                WebElement row = rows.get(i);
	               List<WebElement> cells = row.findElements(By.xpath("td"));
	              
	                // get  the name  from the 3rd column
	               String name = cells.get(2).getText();
	               //get  the user  from the 8th column
	               String user = cells.get(7).getText();
	               System.out.println("Name  present in 'Name' column "+ (i+1) + " :" + name );
	               
	                System.out.println("User present in 'User' column "+ (i+1) + " :" + user );
	            }
	            
		  }
	  
@AfterClass
public void tearDown() {
	  //quit the browser
	  driver.quit();
}
}

		  
	  
	  


