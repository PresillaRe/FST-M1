package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity1 {
	//declare WebDriver 
	WebDriver driver;
  
  //set up  method ->don't give gap b/w annotation &class
  @BeforeClass
  public void setUp() {
	  //initialize webdriver
	  driver = new FirefoxDriver();
	  //open the page
	  driver.get("https://training-support.net");
  }
  //we r not adding 0 because it is default &  it wl  get ignore
  @Test(priority=1)
  public void pageTitleTest() {
	  //get the page title and assert
	 // String pageTitle=driver.getTitle();
	  //assertion
	  assertEquals(driver.getTitle(), "Training Support");
  }
  @Test(priority=2)
  public void aboutUsLinkTest() {
	  //find and click the abous us link
	  driver.findElement(By.linkText("About Us")).click();
	  //verify the new page title
	  assertEquals(driver.getTitle(), "About Training Support");
  }

  @AfterClass
  public void tearDown() {
	  //quit the browser
	  driver.quit();
  }

}
//click Run all to run this activity
