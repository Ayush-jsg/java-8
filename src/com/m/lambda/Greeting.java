package com.m.lambda;

//java program with functional interface and lambda expression

//@functional interface
interface wish {
	void wishmsg();
}

public class Greeting {

	public static void main(String[] args) {

		wish w = () -> System.out.println("Hello");
		w.wishmsg();

	}

}
