/* Create a base class called “vehicle” that stores number of wheels and speed.Create the following derived classes – “car” that inherits “vehicle” and also stores number of passengers. “truck” that inherits “vehicle” and also stores the load limit. Write a main function to create objects of these two derived classes and display all the information about “car” and “truck”. Also compare the speed of these two vehicles - car and truck and display which one is faster. */

// Vehicle base class
class Vehicle 
{
int wheels;
double speed;

public Vehicle(int wheels, double speed) 
{
this.wheels = wheels;
this.speed = speed;
}

public void displayInfo() 
{
System.out.println("Wheels: " + wheels + ", Speed: " + speed + "km/h");
}
}

// Car derived class (inherits Vehicle)
class Car extends Vehicle 
{
int passengers;

public Car(int wheels, double speed, int passengers) 
{
super(wheels, speed);
this.passengers = passengers;
}

public void displayInfo() 
{
super.displayInfo();
System.out.println("Passengers: " + passengers);
}
}

// Truck derived class (inherits Vehicle)
class Truck extends Vehicle 
{
double loadLimit;

public Truck(int wheels, double speed, double loadLimit) 
{
super(wheels, speed);
this.loadLimit = loadLimit;
}

public void displayInfo() 
{
super.displayInfo();
System.out.println("Load Limit: " + loadLimit + " tons");
}
}

// Demonstration of the classes
public class program14 
{
public static void main(String[] args)
{

// Create a car object
Car car = new Car(4, 120.0, 4);
System.out.println("Car Information:");car.displayInfo();

// Create a truck object
Truck truck = new Truck(6, 80.0, 10.0);
System.out.println("Truck Information:");
truck.displayInfo();

// Compare speeds
if (car.speed > truck.speed) 
{
System.out.println("The car is faster than the truck.");
} 

else if (car.speed < truck.speed) 
{
System.out.println("The truck is faster than the car.");
} 

else 
{
System.out.println("The car and truck have the same speed.");
}
}
}
