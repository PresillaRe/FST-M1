package liveProject;

import org.testng.annotations.Test;



	import java.net.MalformedURLException;
	import java.net.URI;
	import java.net.URISyntaxException;
	import java.net.URL;
	import java.time.Duration;

	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.options.UiAutomator2Options;

	public class GooglaChromeActivity3 {
		

		AndroidDriver driver;
		WebDriverWait wait;

		@BeforeClass
		public void setUp() throws MalformedURLException, URISyntaxException {
			// Desired Capabilities
			UiAutomator2Options options = new UiAutomator2Options();
			options.setPlatformName("Android");
			options.setAutomationName("UiAutomator2");
			options.setAppPackage("com.android.chrome");
			options.setAppActivity("com.google.android.apps.chrome.Main");
			options.noReset();

			// Server URL
			URL serverURL = new URI("http://localhost:4723").toURL();

			// Driver initialization
			driver = new AndroidDriver(serverURL, options);
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        // Open the page in Chrome
	        driver.get("https://v1.training-support.net/selenium");
	}
		@Test(priority = 1)
		public void PopupsLoginWithCorrectCreds() throws InterruptedException   {
			// Wait for page to load
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@text=\"Selenium\"]")));
			String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
			
			
			// Scroll to required element
		 driver.findElement(AppiumBy
			.androidUIAutomator(UiScrollable + ".scrollForward(6).getChildByText(className(\"android.view.View\"), \"Popups  Tooltips and Modals \")"));
			//Thread.sleep(10000);
			
			driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Popups  Tooltips and Modals \"]")).click();
			Thread.sleep(1000);
			//find the Sign In button on the page to open a popup with the login form
		
					driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign In \"]")).click();
			 // find the username input field  and enter Username: admin and password input fields on the page
		     
		        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys("admin");
		        //find the password input field and enter Password: password on the page
		        //Thread.sleep(1000);
		     
		        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys("password");
		       // Thread.sleep(1000);
		        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		        Thread.sleep(2000);
		        // Assertions
		     	String LoginMessage = driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"action-confirmation\"]")).getText();
		     			Assert.assertTrue(LoginMessage.contains("Welcome Back, admin"));
		     					
		        
			}
			@Test(priority = 2)
			public void PopupsLoginWithIncorrectCreds() throws InterruptedException   {
			
				//find the Sign In button on the page to open a popup with the login form
				driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign In \"]")).click();
				  Thread.sleep(1000);
				
		        // find the username input field  and enter Username: admin and password input fields on the page
				
		        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys("admin");
		        //find the password input field and enter Password: password on the page
		       // Thread.sleep(5000);
		    
		        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys("passworD");
		       // Thread.sleep(5000);
		      //android.widget.Button[@text="Log in"]
		        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		        Thread.sleep(2000);
		     // Assertions
		     	String LoginMessage = driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"action-confirmation\"]")).getText();
		     			Assert.assertTrue(LoginMessage.contains("Invalid Credentials"));
			
		        
			}
			@AfterClass
			public void tearDown() {
				// Close the browser
				driver.quit();
			}
			
	
}
	
	
