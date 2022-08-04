Feature: Amazon Search

Scenario: Search a Product

Given  I have a search field on Amazon Page
When I search peoduct with namr "Apple MacBook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed
