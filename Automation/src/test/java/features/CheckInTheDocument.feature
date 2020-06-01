Feature:  Check-In the Document

Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login


 
 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |

Scenario: User is able to create new product

    Given Verify user should be on LSCP Home Page
    When Click on 'New Clinical Document' from 'QUICK LINKS' tile
	And Fill all the mandatory fields to create document
	And Click on FINISH button to create document
	Then Verify the document under the 'DOCUMENT IM WORKING ON' tile on 'Dashboard'


Scenario: Check-In the Document

#	Given User should on LSCP home page
	When Search the newly created clinical type of document
	Then Check the State and the Version of the newly created document
	Then Check the 'key' icon in front of the document
	Then Select the document
	Then Click on Check-In/Checkout icon from action toolbar
	Then Click on Check-In option
	Then Enter comment description text box
	Then Select the file
	Then Click on OK button
	Then Check the State and the Version of the document after check-in
	Then Select the document
	Then Preview the selected the document