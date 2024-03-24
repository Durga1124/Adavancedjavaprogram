package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //limit method
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	           	numbers.stream()
				.filter(number-> number%2==0)
				.limit(4)
				.forEach(number->System.out.println(number));
			
		
		    
				
	}

}
