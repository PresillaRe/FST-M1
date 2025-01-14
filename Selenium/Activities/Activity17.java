package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity17 {
	public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
     System.out.println("Page title: " + driver.getTitle());
     //find the dropdown element
     WebElement select2 =driver.findElement(By.xpath("//select[@multiple='']"));
   //creating  select object for above
     Select multiSelect = new Select(select2);
        //Select the HTML option using the visible text.
     multiSelect.selectByVisibleText("HTML");
     
       // Select the 4th,5th and 6th  option using the index.
     for(int i=3;i<= 5;i++) {
    	 multiSelect.selectByIndex(i);
     }
    	
       // Select the "Node" option using the value.
    multiSelect.selectByValue("nodejs");
     //deselect the 5th option using index
    multiSelect.deselectByIndex(4);
        //options that are currently selected
    System.out.println("Selected Options are:");
    List<WebElement>selectedOptions = multiSelect.getAllSelectedOptions();
     for(WebElement selectedOption: selectedOptions) {
    	 System.out.println(selectedOption.getText());
     }

     // Close the browser
        driver.quit();
}
}
