Feature: Login Action
Scenario Outline: Successful Login with Credentials
Given User opens the application
When User click on signin Link
And User enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
| username | password    |
| lalitha  | password123 |
| admin    | password456 |