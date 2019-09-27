Feature: Signup Feature
Scenario: User enters all the required fields to create an account on TestMeApp
Given The Signup Page is opened
When The user enters username as "JaideepSingh"
And The user enters First Name as "Jaideep"
And User eneters Last Name as "Singh"
And User enters Password as "LolPol69"
And User enters Confirm Password as "LolPol69"
And User selects gender as "Male"
And User enters email as "jaideepsingh@gmail.com"
And User enters Mobile Number as "1234567890"
And User enters DOB as "03/07/1997"
And User enters Address as "Chennai"
And User selects Security question as "What is your fav color"
And User enters Answer as "Red"
And The user clicks on Signup button
Then The user is redirected to the Login Page