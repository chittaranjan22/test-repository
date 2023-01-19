package org.inheritance;

interface Vehicle
{
	abstract void changeGear(int gearNumber);
	void speedUp(int speed);
	void applyBrakes(int brake);
	
	default void test()
	{
		System.out.println("This is a test method");
	}
}

class Bicycle implements Vehicle
{
	int speed;
	int gear;

	@Override
	public void changeGear(int gearNumber) {
		
		this.gear=gearNumber;
		
	}

	@Override
	public void speedUp(int increasedSpeed) {
		
		this.speed=this.speed + increasedSpeed;
		
	}

	@Override
	public void applyBrakes(int decrementedSpeed) {
		
		this.speed=this.speed - decrementedSpeed;
	}
	
	public void printStates()
	{
		System.out.println("Speed: "+this.speed + " Gear:"+this.gear);
	}
	
}

class Bike implements Vehicle
{
	int speed;
	int gear;

	@Override
	public void changeGear(int gearNumber) {
		
		this.gear=gearNumber;
		
	}

	@Override
	public void speedUp(int increasedSpeed) {
		
		this.speed=this.speed + increasedSpeed;
		
	}

	@Override
	public void applyBrakes(int decrementedSpeed) {
		
		this.speed=this.speed - decrementedSpeed;
	}
	
	public void printStates()
	{
		System.out.println("Speed: "+this.speed + " Gear:"+this.gear);
	}
	
	
}



public class InterfaceExample {

	public static void main(String[] args) {
		
		Bicycle bicycle=new Bicycle();
		bicycle.changeGear(3);
		bicycle.speedUp(15);
		
		bicycle.printStates(); 
		
		
		Bike bike=new Bike();
		bike.changeGear(3);
		bike.speedUp(20);
		bike.speedUp(10);
		
		bike.applyBrakes(10);
		
		bike.printStates();
		
		
		

	}

}
