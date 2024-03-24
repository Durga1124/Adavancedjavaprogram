package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reduce method

		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum=numbers.stream()
				.reduce(0, (a,b)->a+b);
		
		       System.out.println(sum);
				
	}

}