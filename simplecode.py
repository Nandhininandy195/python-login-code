'''
Created on Mar 1, 2025

@author: Nandhini
'''

from selenium  import webdriver
from selenium.webdriver.common.by import By
from time import sleep


username='xxx@gmail.com'
password='xxxx'

driver = webdriver.Chrome()
driver.get("https://github.com/login")
#driver.find_element("login_field").send_keys(username)
search_bar = driver.find_element(By.ID, "login_field").send_keys(username)
search_bar = driver.find_element(By.ID, "password").send_keys(password)
search_bar = driver.find_element(By.XPATH,"/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[13]").click()

#print(driver.find_element(By.NAME,"//span[contains(text(),'Sign in with a passkey')]"))
print("successful") 
sleep(10)

