# my-shopping-cart
This basic solution, only considers price calculation for scanned items and can apply discount if there is any special offer for any item. An item can be scanned in any order.
## Dependencies
    * Java 11
    * Maven
    * Spring framework
    
## Instruction to run
  Use command "mvn clean install" to build this project, it will also run the test case for checkout. To run with customise input, update CSV file in src/test/resources/checkout.csv for your expected item list and expected amount.
  
## Feedback
This is very basic implementation of shopping cart checkout and didn’t consider any complex or ease case scenarios, even amounts are also Integer.
This solution hasn’t considered, 
•	Updating inventory
•	Removing/updating cart
•	Price calculation after an item is scanned 
•	No database used, items are in memory
