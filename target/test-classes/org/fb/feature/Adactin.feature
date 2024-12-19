Feature: User Login Functionality
To access my account as a registered user
I want to be able to log in with my username and password

Scenario: User Login with valid credentials
Given Login Page
And I have already registered with this application
When I enter valid username and password
Then My profile page should open after successful login

Scenario: User Login with invalid credentials
Given Login Page
When I enter invalid username and password
Then I should get the error message as "Invalid Username and Password"



//cucumber