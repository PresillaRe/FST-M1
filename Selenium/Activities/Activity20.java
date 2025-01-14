package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {
	
	public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the page
        driver.get("https://training-support.net/webelements/alerts");
        // Print the title of the page
     System.out.println("Page title: " + driver.getTitle());
  //   driver.switchTo().defaultContent();
     //find the element to launch the alert
     driver.findElement(By.id("prompt")).click();
     //switch focus to the alert
     Alert  promptAlert =driver.switchTo().alert();
         //print the alert text
     System.out.println("Alert message:" + promptAlert.getText());
   //type into alert
     promptAlert.sendKeys("Awesome!");
     //click OK on the alert
     promptAlert.accept();
     //print the message
     System.out.println("Action performed was:" + driver.findElement(By.id("result")).getText());
     
     // Close the browser
     driver.quit();
}
}
