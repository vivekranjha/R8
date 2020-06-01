Feature:  Create New Submission


Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login


 
 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |

Scenario: User is able to create new product

    Given Verify user should be on LSCP Home Page
    When Click on the ADMIN link present on the left side bar
	And Click on MANAGE link under 'SUBMISSION' accordion
	And Click on ADD button
	And Enter submission deatils
	And Click on Submission SAVE button
	And Search created submission
	Then Verify the created submission on manage submission page