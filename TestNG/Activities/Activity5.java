package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.Color;
import org.testng.Assert;


public class Activity5 {
    WebDriver driver;

    // Include alwaysRun property on the @BeforeClass to make sure the page always
    // opens
    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test(groups = { "HeaderTests", "ButtonTests" })
    public void pageTitleTest() {
    	//Checking the page title
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Selenium: Target Practice");
    }

    @Test(dependsOnMethods = { "pageTitleTest" }, groups = { "HeaderTests" })
    public void HeaderTest1() {
    	//Find the third header and assert the text in the h3 tag.
        WebElement header3 = driver.findElement(By.xpath("//h3[contains(@class, 'orange')]"));
        Assert.assertEquals(header3.getText(), "Heading #3");
    }

    @Test(dependsOnMethods = { "pageTitleTest" }, groups = { "HeaderTests" })
    public void HeaderTest2() {
    	//Find and assert the colour of the fifth header tag element.
        Color header5Color = Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
        Assert.assertEquals(header5Color.asHex(), "#9333ea");
    }

    @Test(dependsOnMethods = { "pageTitleTest" }, groups = { "ButtonTests" })
    public void ButtonTest1() {
    	//Find the button with the class emerald and assert it text.
        WebElement button1 = driver.findElement(By.xpath("//button[contains(@class, 'emerald')]"));
        ;
        Assert.assertEquals(button1.getText(), "Emerald");
    }

    @Test(dependsOnMethods = { "pageTitleTest" }, groups = { "ButtonTests" })
    public void ButtonTest2() {
    	//Find and assert the colour of the first button in the third row
        Color button2Color = Color
                .fromString(driver.findElement(By.xpath("//button[contains(@class, 'teal')]")).getCssValue("color"));
        Assert.assertEquals(button2Color.asHex(), "#134e4a");
    }

    // Include alwaysRun property on the @AfterClass to make sure the page always
    // closes
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        // Close the browser
        driver.close();
    }

}
