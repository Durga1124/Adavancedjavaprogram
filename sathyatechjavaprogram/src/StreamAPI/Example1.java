package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {

		List<String> l=Arrays.asList("sachine","anil","kapil");
		List<String> ll=l.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		       System.out.println(ll);
				
	}

}
