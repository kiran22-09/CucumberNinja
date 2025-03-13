Feature: User Login
Registered User should be able to login to acces account details

Scenario: Login with valid credentials
Given User navigates to Login Page
When User enters valid email address "amotoorocap3@gmail.com"
And User enters valid password "12345"
And clicks on Login button
Then User should Login successfully

Scenario: Login with invalid credentials
Given User navigates to Login Page
When User enters invalid email address "amotoorocap309@gmail.com"
And User enters invalid password "12345456"
And clicks on Login button
Then User should get a proper error message

Scenario: Login with valid email address and invalid password
Given User navigates to Login Page
When User enters valid email address "amotoorocap3@gmail.com"
And User enters invalid password "12345456"
And clicks on Login button
Then User should get a proper error message

Scenario: Login with invalid email address and valid password
Given User navigates to Login Page
When User enters invalid email address "amotoorocap3987@gmail.com"
And User enters valid password "12345"
And clicks on Login button
Then User should get a proper error message


Scenario: Login without providing any credentials
Given User navigates to Login Page
When User dont enter any credentials
And clicks on Login button
Then User should get a proper warning message
