package activities;



	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Activity15 {
	    public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        // Create the Wait object
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the page
	        driver.get("https://training-support.net/webelements/dynamic-attributes");
	        // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());

	        // Find the full name and enter the details
	       driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]")).sendKeys("Presilla");
	    // Find the email field and enter the details
	       driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("presilla@ibm.com");
	    // Find the date field-YYYY-MM-DD and enter the details
	         driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]")).sendKeys("2024-01-10");
	      // Find the additional details and enter the additional details
	       driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]")).sendKeys("today's date");
	      
	        // Find and click the submit button
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        // to print confirmation message
	        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")))
	                .getText();
	    
	        System.out.println( message);

	        // Close the browser
	        driver.quit();
	    }
	}

