package activities;

import org.openqa.selenium.Point;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import static activities.ActionBase.doSwipe;
public class Activity6 {
  //https://training-support.net/webelements/sliders
	
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

			// Open Selenium page
			driver.get("https://training-support.net/webelements/sliders");
		}

		@Test(priority=1)
		public void volume75Test() {
			// Wait for page to load
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar")));
			// Get the size of the screen
			Dimension dims = driver.manage().window().getSize();
			// Set the start and end points
			Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .66));
			Point end = new Point((int) (dims.getWidth() * .67), (int) (dims.getHeight() * .66));
			// Perform swipe
		doSwipe(driver, start, end, 2000);

			// Get the volume level
			String volumeText = driver
				.findElement(AppiumBy.xpath("//android.view.View[contains(@text, '%')]"))
				.getText();

			// Assertions
			//assertTrue(volumeText.contains("75%"));
		}

		@Test(priority=2)
		public void volume25Test() {
			// Wait for page to load
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar")));
			// Get the size of the screen
			Dimension dims = driver.manage().window().getSize();
			// Set the start and end points
			Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .66));
			Point end = new Point((int) (dims.getWidth() * .33), (int) (dims.getHeight() * .66));
			// Perform swipe
			doSwipe(driver, start, end, 2000);

			// Get the volume level
			String volumeText = driver
				.findElement(AppiumBy.xpath("//android.view.View[contains(@text, '%')]"))
				.getText();

			// Assertions
			//assertTrue(volumeText.contains("25%"));
		}

		@AfterClass
		public void tearDown() {
			// Close the browser
			driver.quit();
		}
	}

