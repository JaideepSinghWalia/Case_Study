Feature: Functionality of Search Bar
Scenario Outline: Check if the Search Bar is working as expected
Given User opens Application
And User Logs into account
When User enters "<search>" with "<Item>" check
Then Testcase is successful

Examples:
| search |   Item     |
|  fict  |  Fiction   |
|  smar  | Smartphone |