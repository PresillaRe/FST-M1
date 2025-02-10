package liveProject;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GoogleKeepActivity2 {
	AndroidDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		// Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.keep");
		options.setAppActivity(".activities.BrowseActivity");
		options.noReset();

		// Server URL
		URL serverURL = new URI("http://localhost:4723").toURL();
		// Driver Initialization
					driver = new AndroidDriver(serverURL, options);
					wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void googleKeepReminderTest() throws InterruptedException {
		//Open the Google Keep app and Click the Create New Note button to add a new Note.
		//find + icon and click 
		driver.findElement(AppiumBy.accessibilityId("Create a note")).click();
		Thread.sleep(3000);
		//clik on popup to add text
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"New text note\"]")).click();
		Thread.sleep(3000);
		//Add a title for the note and add a small description.
		//find title and type in it
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.keep:id/editable_title\"]")).sendKeys(" Google Keep Note1");
		//find description and type in it
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.keep:id/edit_note_text\"]")).sendKeys("Activity for google keep");
		//Click the reminder icon on the toolbar to add a reminder for Afternoon of the same day
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Reminder\"]")).click();
		Thread.sleep(1000);
		//
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/menu_text\" and @text=\"Pick a date & time\"]")).click();
		Thread.sleep(1000);
		//to set for afternoon
		driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.google.android.keep:id/time_spinner\"]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/text\" and @text=\"Afternoon\"]")).click();
		Thread.sleep(1000);
		//click on save
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.google.android.keep:id/save\"]")).click();
		//Press the back button and switch to the Reminders page.
		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
		Thread.sleep(1000);
		//Make an assertion to ensure that the note was added with a reminder
		
		String addedNote = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/index_note_title\"]")).getText();
		//System.out.println(addedNote);
		Assert.assertTrue(addedNote.contains("Google Keep Note1"));
		String addedReminder = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/reminder_chip_text\"]")).getText();
		Assert.assertTrue(addedReminder.contains("Tomorrow, 1:00 PM"));
		
	}
	// Tear down method
			@AfterClass
			public void tearDown() {
				// Close the app
				driver.quit();
			}
}
