
package com.m.interface_change;

//java program default and static method()

interface Vehicle3 {

	static void cleanvehicle() {
		System.out.println("I am cleaning vehicle");
	}

	default void startvehicle() {
		System.out.println("vehicle starting....");
	}
}

public class Car3 implements Vehicle3 {

	public static void main(String[] args) {

		// calling static method
		Vehicle3.cleanvehicle();

		Car3 c = new Car3();

		// calling default method
		c.startvehicle();
	}

}
