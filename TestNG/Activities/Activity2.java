package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
//set up method
    @BeforeTest
    public void beforeMethod() {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test
    public void testCase1() {
        // This test case will pass
       
     assertEquals(driver.getTitle(), "Selenium: Target Practice");
    }

    @Test
    public void testCase2() {
        // This test case will Fail
        WebElement pinkButton = driver.findElement(By.cssSelector("button.bg-pink-200"));
        assertTrue((pinkButton.isDisplayed()));
        
        assertEquals(pinkButton.getText(), "pink");
    }

    @Test(enabled = false)
    public void testCase3() {
        // This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void testCase4() {
        // This test will be skipped and will be be shown as skipped
        throw new SkipException("This was Skipped to prove a point");
    }

    @AfterTest
    public void afterMethod() {
        // Close the browser
        driver.close();
    }
}
