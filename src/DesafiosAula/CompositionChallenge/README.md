## Intructions
In this challenge, you need to create an application for controlling a smart kitchen.
The kitchen has a Coffee Maker, Dishwasher, and Refrigerator.

The coffee maker has method brewCoffee() 
The dishwasher has method doDishes()
The refrigerator has method orderFood()

both classes has a parameter hasWorktoDo, which is a boolean that indicates if the appliance has work to do.

The class SmartKitchen has a method setKitchenState() that receives a trhee parameters, one for each appliance, and sets the state of the kitchen. 

After calling the method setKitchenState(), the method doKitchenWork() should be called. This method should call the methods of the appliances that have work to do.

The methods on the parts of the kitchen should be called only if the flag workToDo is true.

