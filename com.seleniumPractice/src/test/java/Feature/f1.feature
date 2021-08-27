Feature: To test the PHP Travels application
@1stscenario
Scenario: to test the register page of phptravels
Given open chrome browser and url of the application
When enter all valid credentials
Then Register success

@2ndscenario
Scenario: to test the login page of phptravels
Given navigate to login screen
When enter username and password
Then login success

@3rdscenario
Scenario: to test checkout page of phptravels
Given navigate to home screen
When add a product to cart
Then checkout success

