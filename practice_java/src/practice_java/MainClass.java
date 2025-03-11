package practice_java;

class Vehicle {
	
	String brand;
	int year;
	
	void startengine()
	{
		System.out.println("Engine is starting!");
		
	}
}

class Car extends Vehicle{
	
	String fueltype;
	
	
	// we are overriding the function startengine and also inherits from class vehicle
	@Override
	void startengine() {
		// TODO Auto-generated method stub
		System.out.println("Car engine starts");
		
		
	}
	
	void drive()
	{
		System.out.println("Car is driving");
		
	}
}

class truck extends Vehicle{
	
	int loadCapacity;
	
	@Override
	void startengine() {
		// TODO Auto-generated method stub
		System.out.println("Truck engine starts");
	}
	
	void haul()
	{
		System.out.println("Truck is hauling");
		
	}
	
}

public class MainClass {

	public static void main (String[] args)
	{
	
		truck t1 = new truck();
		t1.startengine();
		t1.haul();
		
		Car c1 = new Car();
		c1.drive();
		
	}
}
