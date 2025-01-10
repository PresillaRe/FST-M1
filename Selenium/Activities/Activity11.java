package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	
	    public static void main(String[] args) {
	        // initialize a driver
	        WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the browser
	        driver.get("https://www.training-support.net/webelements/dynamic-controls");

	        // print page title
	        System.out.println("Page title is: " + driver.getTitle());

	        // Find the checkbox element
	        WebElement checkbox = driver.findElement(By.id("checkbox"));
	        

	        // click the button to toggle visibility
	        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
	        
	        // Wait for checkbox to disappear
	        wait.until(ExpectedConditions.invisibilityOf(checkbox));
	        
	        
	        
	        // click the button to toggle visibility
	        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
	        
	        //wait for the checkbox to apper and then click it
	        wait.until(ExpectedConditions.visibilityOf(checkbox)).click();
	       

	        // Close the browser
	        driver.quit();
	    }
	}

