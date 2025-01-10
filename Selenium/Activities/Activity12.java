package activities;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Activity12 {

		
		    public static void main(String[] args) {
		        // initialize a driver
		        WebDriver driver = new FirefoxDriver();
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Open the browser
		        driver.get("https://training-support.net/webelements/dynamic-content");

		        // print page title
		        System.out.println("Page title is: " + driver.getTitle());

		        // Find the button
		        driver.findElement(By.id("genButton")).click();
		        

		        // wait till release appears on the page
		       
		        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
		        
		        
		        
		        // then print the text
		        System.out.println(driver.findElement(By.id("word")).getText());
		       

		        // Close the browser
		        driver.quit();
		    }
		}


