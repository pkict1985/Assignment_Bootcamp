Feature: CreateLead functionality for Leaftaps Application

Background: 
Given Open the Chrome browser
And Load the application url
And Enter the username as 'Democsr2'
And Enter the password as 'crmsfa'
When Click the Login button
Then Homepage should be displayed

Scenario Outline: Create Lead record with different data
Given Click CRM/SF link
And Click Leads tab
And Create Lead link
When Enter the companyname as <companyname>
And Enter the firstname	as <firstname>
And Enter the lastname as <lastname>
Then Click CreateLeadsButton

Examples:
|companyname|firstname|lastname|
|TestLeaf|Praveena|K|
|Testleaf|Mooza|shah|
