Feature: Create New Personal Libray

Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login


 
 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |
 
 
Scenario: Creating new personal Library

Given User should be on LSCP Home Page
When Click on 'LIBRARY' accordion on the left side bar
And Click on pluss icon under 'PERSONAL LIBRARY' accordion
And Enter the Library name
And Click on the folder Dropwdown 
And Select dropdown value as 'Type'
And Click on Filter icon
And Select Clinical check box
And Click on Library create button
Then Verify successful message for library creation 
Then Check the newly created library under 'PERSONAL LIBRARY' accordion
And Expand library by clicking on arrow
And Click on the property 'Clinical'
Then Verify clinical document should display on search grid