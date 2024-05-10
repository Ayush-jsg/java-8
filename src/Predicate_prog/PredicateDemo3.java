package Predicate_prog;

import java.util.function.Predicate;

public class PredicateDemo3 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(8));

		System.out.println("===============================");

		String[] names = { "Kajal", "Katrina", "Kareena", "Anuska", "Mallika", "Alia" };
		Predicate<String> p1 = s -> s.charAt(0) == 'K';
		for (String name : names) {
			if (p1.test(name)) {
				System.out.println(name);
			}
		}

	}
}
