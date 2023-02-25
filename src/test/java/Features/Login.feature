Feature: Login functionality for Leaftaps Application
Scenario: Login with positive credential
Given Open the Chrome browser
And Load the application url
And Enter the username as 'Democsr2'
And Enter the password as 'crmsfa'
When Click the Login button
Then Homepage should be displayed

Scenario: Login with Negative credential
Given Open the Chrome browser
And Load the application url
And Enter the username as DemoSalesManager5
And Enter the password as crmsfa4
When Click the Login button
Then ErrorMessage should be displayed