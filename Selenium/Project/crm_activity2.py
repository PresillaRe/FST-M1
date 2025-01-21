# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
driver=webdriver.Chrome()
 
    # Navigate to the URL
driver.get("http://alchemy.hguy.co/crm")

   

    # Find the "header image" 
header =driver.find_element(By.XPATH,"//img[@alt='SuiteCRM']")

    # Print the url of the header image
print("Header image URL IS:", header.get_dom_attribute("src"))
driver.quit()