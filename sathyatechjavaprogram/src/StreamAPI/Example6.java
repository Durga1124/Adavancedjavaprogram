package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//coolect method

		List<String> names=Arrays.asList("sachine","dhoni","anil","kapil");
		String commaSeparatedNmaes=names.stream()
				.collect(Collectors.joining(" "));
				
		       System.out.println(commaSeparatedNmaes);
				
	}

}
