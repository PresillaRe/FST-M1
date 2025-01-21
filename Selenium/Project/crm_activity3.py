# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
driver=webdriver.Chrome()
 
    # Navigate to the URL
driver.get("http://alchemy.hguy.co/crm")
#find the first copyright text in the footer.
copyRight =driver.find_element(By.ID,"admin_options")
		#print the text to the console.
print( "First copyright text in the footer is:" , copyRight.text)
