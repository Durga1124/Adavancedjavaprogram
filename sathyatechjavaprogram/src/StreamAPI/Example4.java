package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=Arrays.asList("sachine","anil","kapil","dravid");
		List<String> sortedNames=names.stream()
				.sorted()
				.collect(Collectors.toList());
		
		       System.out.println(sortedNames);
				
	}

}
