package java8Features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//iterating the list interface
		List<Integer> l=Arrays.asList(10,20,30,40,50);
		l.forEach(x->System.out.println(x));
		
		//itering the set interface
		Set<Integer> s=new HashSet<Integer>(l);
		s.forEach(System.out::println);
		
		//iterating the map interface
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(3, "sachin");
		m.put(1, "rahul");
		m.put(2, "arjun");
		m.forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
