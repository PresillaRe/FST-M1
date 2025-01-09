package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        //find the textbox element
        WebElement textbox = driver.findElement(By.id("textInput"));
        
        //print the visibility of the textbox
      
        System.out.println("Is the textbox enabled?: " + textbox.isEnabled());
        // fine and Click the button to toggle textbox
        driver.findElement(By.id("textInputButton")).click();
        // print the visibility of the textbox
        System.out.println("Is the textbox enabled?: " + textbox.isEnabled());
        
        // Close the browser
        driver.quit();

}

}
