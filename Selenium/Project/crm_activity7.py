# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
import time
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
#find the sales item and click it
		
driver.find_element(By.XPATH,"//a[text()='Sales']").click()
#find the leads item and click it
driver.find_element(By.XPATH,"//a[text()='Leads']").click()
		
time.sleep(2)
 #find  the  additional details icon from the table
driver.find_element(By.XPATH,"(//span[(@class='suitepicon suitepicon-action-info')])[1]").click()
time.sleep(2)
		
 #find the mobile number on popup and print it 
popup_element= driver.find_element(By.XPATH,"//span[@class='phone']")
mobile=popup_element.text
	
	      
print("Mobile Number is:"+ mobile)
	     