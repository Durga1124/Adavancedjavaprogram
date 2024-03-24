package java8Features;

import java.util.*;


public class Example2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> numbers=new LinkedList<>(Arrays.asList(1,2,3,4,5));
		numbers.forEach(n->System.out.println(Math.pow(n, 3)));
		
	}

}
