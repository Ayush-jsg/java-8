package com.m.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//java program with lambda expression to  sort Arraylist elements

public class Demo {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(205);
		l.add(102);
		l.add(98);
		l.add(275);
		l.add(203);
		System.out.println("Elements of the Arraylist before sorting : " + l);
		
		//using lambda expression in place of comparator object
		Collections.sort(l, (o1, o2) -> (o1 > o2) ? -1 : (o1 < 02) ? 1 : 0);
		
		System.out.println("Elements of the Arraylist after sorting : " + l);
	}

}
