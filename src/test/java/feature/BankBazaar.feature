Feature: View mutual funds
Scenario Outline: Positive test case to findout the mutualfund schemes
#Given launch the browser
#And maximize the browser
#And set the timeouts
#And Enter the url
And click investment
And click mutual funds
And click search for mutual funds
And select birth month and year
#Then verified till select month
And select birth date
#And verify birthday
And click continue
And type annual income <income>
And click annual income continue
#And select other bank
And select your bank
#And click bank continue
And set your name <firstname>
When clicks on view mutual funds
Then print scheme name and amount

Examples:
|income|firstname|
|400000|Aasa|


