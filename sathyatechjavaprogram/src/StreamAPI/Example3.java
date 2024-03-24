package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers=Arrays.asList(1,2,3,2,4,3,5,6,5);
		List<Integer> uniqueNumbers=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		       System.out.println(uniqueNumbers);
				
	}

}