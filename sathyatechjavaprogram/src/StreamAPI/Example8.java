package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//count method
		
		List<String> names=Arrays.asList("sachine","rahul","anil","kapil","prasad");
		long count=names.stream().count();
		System.out.println("Number of names:"+count);
	}

}
