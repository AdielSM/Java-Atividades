## Instructions

In this challenge, you nedd to create a class named Printer.
The fields of this class must be:

- tonerLevel (int) witch is the percentage of toner available
- pagesPrinted (int) witch is the number of pages printed
- duplex (boolean) witch is the duplex mode of the printer

You must create the following methods:

- addToner (int) witch takes a tonerAmount argument
  - tonerAmount is the amount of toner to be added to the printer
  - tonerLevel must be between 0 and 100
    - if tonerAmount is not in this range, the method must return -1 and not add the toner
    - if tonerAmount is in the range, the method must return the new tonerLevel
    - in the case of a tonerLevel greater than 100, the tonerLevel must be set to 100

- printPages (int) witch takes a pages argument
  - it should determine how many sheets of paper are needed to print the pages based on whether the printer is in duplex mode or not
    - the sheet number must be added to pagesPrinted, in case the printer is in duplex mode, 
    the number of sheets needed to print the pages must be divided by 2
    - if it's a duplex printer, print a message "Printing in duplex mode"