Feature: Login Into Application
Scenario: Successful login with valid data
Given User launch Chrome browser
When User open url "https://opensource-demo.orangehrmlive.com/"
And User Enters User Name as "Admin" and password as "admin123"
And Click On Login
Then Page TitleShould be displayed as "OrangeHRM"
And Click On welcomeLink
And Click On LogOut Link



Scenario Outline: Successful login with valid data with DataProvided
Given User launch Chrome browser
When User open url "https://opensource-demo.orangehrmlive.com/"
And User Enters User Name as "<username>" and password as "<password>"
And Click On Login
Then Page TitleShould be displayed as "OrangeHRM"
And Click On welcomeLink
And Click On LogOut Link

Examples:
|username|password|
|Admin|admin123|
|Admin|admin123|


