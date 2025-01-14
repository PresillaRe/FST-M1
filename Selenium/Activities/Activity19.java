package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19 {
	public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the page
        driver.get("https://training-support.net/webelements/alerts");
        // Print the title of the page
     System.out.println("Page title: " + driver.getTitle());
     //find the element to launch the alert
     driver.findElement(By.id("confirmation")).click();
     //switch focus to the alert
     Alert  confirmAlert =driver.switchTo().alert();
     //print the alert text
     System.out.println("Alert message :" + confirmAlert.getText());
     //click OK on the alert
     confirmAlert.accept();
     //print the message
     System.out.println("Action performed was:" + driver.findElement(By.id("result")).getText());
     
     // Close the browser
     driver.quit();
}

}
