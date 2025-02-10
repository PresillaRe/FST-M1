package liveProject;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GoogleChromeActivity1 {
 
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
	public void ToDoLisCheck() throws InterruptedException   {
		// Wait for page to load
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@text=\"Selenium\"]")));
		String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
		
		// Scroll to required element
				 driver.findElement(AppiumBy
					.androidUIAutomator(UiScrollable + ".scrollForward(9).getChildByText(className(\"android.view.View\"), \"To-Do List  Elements get added at run time \")"));
					//Thread.sleep(10000);
					
					driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"To-Do List  Elements get added at run time \"]")).click();
					// Thread.sleep(2000);
					// find the input field on the page
					WebElement InputBox = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"taskInput\"]"));
					WebElement addTaskButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Add Task\"]"));
					
					//Add the below 3 tasks
					InputBox.sendKeys("Add tasks to list");
					addTaskButton.click();
				    InputBox.sendKeys("Get number of tasks");
					addTaskButton.click();
					InputBox.sendKeys("Clear the list");
					addTaskButton.click();
					Thread.sleep(2000);
					//click on the pop-up
					driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]")).click();
					Thread.sleep(2000);
					//Click on each of the tasks added to strike them out.
					List<WebElement> tasksDelete = driver.findElements(AppiumBy.xpath("//android.view.View[@text=\"Add more tasks to this list.\"]"));
					 for (int i = 0; i < tasksDelete.size(); i++) {
					        WebElement task = tasksDelete.get(i);
					        task.click();
//					       
					    }
					//clear the list.
						driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"tasksCard\"]/android.view.View[3]")).click();
						 Thread.sleep(4000);
						List<WebElement> emptyTask=   driver.findElements(AppiumBy.xpath("//android.view.View[@resource-id=\"tasksList\"]"));
						
						//Check if the number of tasks is zero
//				
						Assert.assertEquals((emptyTask.size()-1), -1);
					}
	
      
	// Tear down method
	@AfterClass
			public void tearDown() {
				// Close the app
				driver.quit();
			}
		

}
