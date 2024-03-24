package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {

	public static void main(String[] args) {
		//length of names sachine-7,anil-4,kapil-5
		
		List<String> stationary=Arrays.asList("sachine","anil","kapil");
		List<Integer> l=stationary.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		       System.out.println(l);

	}

}
