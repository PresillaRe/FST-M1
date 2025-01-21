# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

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
			  