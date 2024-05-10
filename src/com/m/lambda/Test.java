package com.m.lambda;

//java program with functional interface and lambda expression

//@functional interface
interface calculator {
	public void add(int i, int j);
}

public class Test {
	public static void main(String[] args) {
		calculator c = (i, j) -> System.out.println("sum :: " + (i + j));
		c.add(10, 20);
		c.add(30, 50);
	}

}
