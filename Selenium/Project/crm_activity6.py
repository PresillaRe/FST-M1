# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
driver=webdriver.Chrome()
 
    # Navigate to the URL
driver.get("http://alchemy.hguy.co/crm")
#find the username and type in the username
driver.find_element(By.ID,"user_name").send_keys("admin")
			  #find the passwrd filed and type in the passwrd
driver.find_element(By.ID,"username_password").send_keys("pa$$w0rd")
			  
			  
			 # find the Log in button and click it
driver.find_element(By.XPATH,"//input[@id='bigbutton']").click()
homePage=driver.find_element(By.ID,"tab0").text
if(homePage== "SUITECRM DASHBOARD"):
    print(" homepage has opened")
else:
    print("Login failed")
     #find the navigation menu
driver.fullscreen_window()
		
driver.find_element(By.CLASS_NAME,"desktop-toolbar")
		#adding wait  to load the navigation menu.
wait = WebDriverWait(driver, 2)
		 
		 
		 ##//find AND Ensure that the “Activities” menu item exists. 
		 
		
activities_menu=wait.until(EC.visibility_of_element_located((By.XPATH,"//a[contains(text(),'Activities')]")))
if activities_menu.is_enabled() and activities_menu.is_displayed():
                print("Activities menu is present")
else:
        print("Activities menu is not present") 