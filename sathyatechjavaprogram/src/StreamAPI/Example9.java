package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//parallelstreams
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		int sum1=numbers.parallelStream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of numbers:"+sum1);
	}

}
