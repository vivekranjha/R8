Feature: Virtual document


Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login


 
 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |

Scenario: Create new virtual document

Given User should be on LSCP Home Page
When Search the document from the search bar
And Select the document
And Click on Virtual Document icon from the action tool bar
And Click on option 'Convert to Virtual Document'
Then Verify successful message for conversion to virtual document
Then Verify Virtual document icon
And Select the document
And Do right click and select 'Expand' option
Then Verify user is redirected to Virtual document page
And Select the document
And Click on Virtual Document icon from the action tool bar
And Click on option 'Add Child Using New Document'
And Fill all the mandatory fields to create document
And Click on FINISH button to create document
Then Verify successful message for adding child document
Then Verify child should be added
And Select the parent document
And Check-in the parent document
Then Verify successful message for check-in the document
And Select the child document
And Click on Virtual Document icon from the action tool bar
And Click on option 'Remove Child'
And Click on Yes button to remove child
Then Verify successful message for removing child document
Then Verify child document is removed
And Click on Add to Favourite icon of parent vitual document
Then Verify icon color should be yellow
Then Verify favourite parent virtual document on virtual document tile on dashboard