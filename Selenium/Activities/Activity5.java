package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        //find the checkbox element
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        
        //print the visibility of the checkbox
      
        System.out.println("Is the Checkbox visible?: " + checkbox.isDisplayed());
        // fine and Click the button to toggle checkbox
        driver.findElement(By.xpath("//button[contains(text(),'Toggle ')]")).click();
        // print the visibility of the checkbox
        System.out.println("Is the Checkbox visible?: " + checkbox.isDisplayed());
        
        // Close the browser
        driver.quit();
}
}
