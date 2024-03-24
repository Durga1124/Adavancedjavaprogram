package java8Features;

import java.util.Arrays;
import java.util.HashSet;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<>(Arrays.asList("java","python","oracle"));
		set.forEach(s->{ if(s.startsWith("j")); System.out.println(s); });
	}

}

