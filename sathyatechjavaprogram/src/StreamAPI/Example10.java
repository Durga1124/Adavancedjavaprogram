package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		
		List<Integer> numbers=Arrays.asList(5,4,5,3,7);
		List<Integer> sqnums=numbers.stream()
				.map(num->num*num)
				.collect(Collectors.toList());
		
		       System.out.println(sqnums);
	}

}
