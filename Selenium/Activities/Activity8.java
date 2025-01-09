package activities;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Activity8 {
	    public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        // Create the Actions object
	        Actions builder = new Actions(driver);

	        // Open the page
	        driver.get("https://training-support.net/webelements/mouse-events");
	        // Print the title of the page
	        System.out.println("Page title: " + driver.getTitle());

	        // Find the all the button on page
	        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
	        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
	        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
	        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
	       // WebElement openOpetion = driver.findElement(By.xpath("//div[@id='menu']//ul/li[1]"));

	        
//left click .lock button, then click .toml button
	        builder.click(cargoLock).pause(5000L).moveToElement(cargoToml).pause(5000L).click().build().perform();
	       //print the message at the end of the sequence
	        System.out.println(driver.findElement(By.id("result")).getText());
	        
	      //double click src button, then right click target button
	        builder.doubleClick(srcButton).pause(5000L).contextClick(targetButton).pause(5000L).build().perform();
	        
	        driver.findElement(By.xpath("//div[@id='menu']//ul/li[1]")).click();
	       //print the message at the end of the sequence.
	        System.out.println(driver.findElement(By.id("result")).getText());
	        // Close the browser
	        driver.quit();
	    }
	}


