## Intructions

Create a base class called Vehicle with the following attributes and methods:

one field called description of type String.
Three methods:
public startEngine() 
public drive()
protected runEngine()

the runEngine method only be called by drive method.

Create three subclasses of Vehicle called:
GasPoweredCar
ElectricCar
HybridCar   

The GasPoweredCar class has the following attributes:

one field called avgKmPerLiter of type double.
one field called cylinders of type int.

The ElectricCar class has the following attributes:

one field called avgKmPerCharge of type double.
one field called batterySize of type int.

The HybridCar class has the following attributes:

one field called avgKmPerLiter of type double.
one field called batterySize of type int.
one field called cylinders of type int.

Both subclasses have to reimplement the methods present in the base class Car.
