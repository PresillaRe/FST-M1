# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
#driver=webdriver.Chrome()
with webdriver.Firefox() as driver: 
 
    # Navigate to the URL
 driver.get("http://alchemy.hguy.co/crm")
 # get the title of the page and check the title matches "SuiteCRM"
 if(driver.title=="SuiteCRM"):
        print("Page title is: ", driver.title)
 else:
     print("Wrong page")
     