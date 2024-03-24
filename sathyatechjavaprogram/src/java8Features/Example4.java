package java8Features;

import java.util.Arrays;
import java.util.TreeSet;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set=new TreeSet<>(Arrays.asList("java","python","oracle"));
		set.forEach(s->{
			String uppercase=s.toUpperCase();
			System.out.println(uppercase);
		});
	}

}
