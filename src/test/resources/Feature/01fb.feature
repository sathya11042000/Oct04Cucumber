@feature1

Feature: To validate Login functionality of Facebook application 

Background:
Given  To launch the chrome browser and hit the url  
  
 @sanity 
Scenario: To validate invalide usename and valide password

When  To enter the invalide username in emailfield

|username|priya|
|mobilenumber|9876543210|
|password|priya123|

And To enter the valide password in password field
|pass1|pass2|pass3|
|12345|213tfgax|ajhsxa87654|
|000000|1111111111|qiwusiqkaz|
|09876543|amsxqjkhws1i|kjws9827x|

And  To click the login button

Then  To close chrome browser


@regression
Scenario Outline:  To validate valide usename and invalide password

When   enter the invalide username "<emailfield>" in emailfield

And  enter the valide password "<passwordfield>" in password field

And   click the login button

Then   close chrome browser

Examples:

|emailfield|passwordfield|
|12345@gmail.com|12345|
|cucumber@gmail.com|cucumber|
|sql123@gmail.com|sql|

