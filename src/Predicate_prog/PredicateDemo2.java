package Predicate_prog;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {

		String[] names = { "Anuska", "Anupama", " Deepika", "Kajol", "Anshu" };

		Predicate<String> p = name -> name.charAt(0) == 'A';
		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}

		}
	}

}
