package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity3 {
	//declare WebDriver 
		WebDriver driver;
	  
	  //set up  method ->don't give gap b/w annotation &class
	  @BeforeClass
	  public void setUp() {
		  //initialize webdriver
		  driver = new FirefoxDriver();
		  //open the page
		  driver.get("https://training-support.net/webelements/login-form");
	  }
	  //we r not adding 0 because it is default &  it wl  get ignore
	  @Test(priority=1)
	  public void pageTitleTest() {
		  //get the page title and assert
		 // String pageTitle=driver.getTitle();
		  //assertion
		  assertEquals(driver.getTitle(), "Selenium: Login Form");
	  }
	  @Test(priority=2)
	  public void loginFormTest() {
		  //find the username and type in the username
		  driver.findElement(By.id("username")).sendKeys("admin");
		  //find the passwrd filed and type in the passwrd
		  driver.findElement(By.id("password")).sendKeys("password");
		  
		  
		  //find the submit button and click it
		  driver.findElement(By.xpath("//button[text()='Submit']")).click();
		  
		  //verify the login message
		  String message = driver.findElement(By.tagName("h2")).getText();
		  assertEquals(message, "Welcome Back, Admin!");
	  }

	  @AfterClass
	  public void tearDown() {
		  //quit the browser
		  driver.quit();
	  }

	
}
