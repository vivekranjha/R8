Feature:  Create New Clinical Study

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
    And Click on Clinical Study link under DICTIONARY MANAGEMENT accordion
    And Click on CREATE button
    And Enter clinical study details
    And Click on SAVE button
    And Search created clinical study
    Then Verify the newly created clinical study