@feature2
Feature: To validate SignIn functionality of Amazon application 
@smoke @sanity
Scenario: To validate valide username and valies paessword

Given Launch the chrome browser and hit the amazon url 

When  To send the username or mobile number in enmaild field
And To click continue button
And  To send the password in password field
And To click the sign in button
Then  To close the amazon page browser


