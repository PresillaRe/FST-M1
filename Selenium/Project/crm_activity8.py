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
 #find the accounts item and click it
driver.find_element(By.XPATH, "//a[text()='Accounts']").click()
time.sleep(1) 
# Find the table on the page and print the names of the first 5 odd-numbered rows of the table to the console
print("The first five Odd names are : ")
namesList = driver.find_elements(By.XPATH,"//table[@class='list view table-responsive']/tbody/tr/td[3]")
for x in range(0, 10, 2):
        print(x+1,namesList[x].text)