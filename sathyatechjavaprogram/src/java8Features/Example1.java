package java8Features;
import java.util.*;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("java","python","oracle"));
		list.forEach(System.out::println);
	}

}
