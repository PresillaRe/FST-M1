package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
	public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the page
        driver.get("https://training-support.net/webelements/tabs");
        // Print the title of the page
     System.out.println("Page title: " + driver.getTitle());
      //print the current page handle
     System.out.println("Pgae handle is" + driver.getWindowHandles());
     //find the button to open a new tab and click it
     driver.findElement(By.xpath("//button[contains(text(),'Open')]")).click();
     //wait for a new tab to open
     wait.until(ExpectedConditions.numberOfWindowsToBe(2));//we wl wait until the 2 tabs open i.e.1 is previuos tab , 2nd is newly clicked tab
     //print the window handles
     System.out.println("Current windows open" + driver.getWindowHandles());
     //switch to the new tab
     for(String handle: driver.getWindowHandles()) {
    	 driver.switchTo().window(handle);
     }
     //print the new page title
    System.out.println("Page title is:" + driver.getTitle());
     //print the current page handle
     System.out.println("Page handle is" + driver.getWindowHandle());
     //print the message on the page
     System.out.println("Page message is :" + driver.findElement(By.cssSelector("h2.mt-5")).getText());

   //find the button to open a new tab and click it
     driver.findElement(By.xpath("//button[contains(text(),'Open')]")).click();
     //wait for a new tab to open
     wait.until(ExpectedConditions.numberOfWindowsToBe(3));//we wl wait until the 2 tabs open i.e.1 is previuos tab , 2nd is newly clicked tab
     //print the window handles
     System.out.println("Current windows open" + driver.getWindowHandles());
     //switch to the new tab
     for(String handle: driver.getWindowHandles()) {
    	 driver.switchTo().window(handle);
     }
     //print the new page title
    System.out.println("Page title is:" + driver.getTitle());
     //print the current page handle
     System.out.println("Page handle is" + driver.getWindowHandle());
     //print the message on the page
     System.out.println("Page message is :" + driver.findElement(By.cssSelector("h2.mt-5")).getText());
 // Close the browser
     driver.quit();
	
	}
}
