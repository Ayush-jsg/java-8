package com.m.interface_change;

// java program on interface -static method()

interface Vehicle2 {
	void cleanvehicle();

	public static void startvehicle() {
		System.out.println("vehicle is starting");
	}
}

public class Car2 implements Vehicle2 {

	@Override
	public void cleanvehicle() {
		System.out.println("cleaning the vehicle");

	}

	public static void main(String[] args) {
		Car2 c = new Car2();
		Vehicle2.startvehicle();
		c.cleanvehicle();
	}

}
