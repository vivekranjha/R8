Feature:  Login Page


Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login
 Then Verify user should be on LSCP Home Page


 
 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |

 
 