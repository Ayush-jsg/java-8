package com.m.interface_change;

// java program on interface -Default method()

interface Vehicle {
	void cleanvehicle();

	default void startvehicle() {
		System.out.println("vehicle is starting");
	}
}

public class Car implements Vehicle {

	@Override
	public void cleanvehicle() {
		System.out.println("cleaning the vehicle");

	}

	public static void main(String[] args) {
		Car c = new Car();
		c.cleanvehicle();
		c.startvehicle();

	}

}
