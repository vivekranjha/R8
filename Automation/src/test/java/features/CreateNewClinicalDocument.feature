Feature:  Create New Clinical Document


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