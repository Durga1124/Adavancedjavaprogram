package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//last name print 
//		List<String> words=Arrays.asList("durga","anil","kapil","malli");
//		List<Character> lastChar=words.stream()
//				.map(s->s.charAt(s.length()-1))
//				.collect(Collectors.toList());
//		
//		       System.out.println(lastChar);
					
		
		
		// first name print
//		List<String> words=Arrays.asList("durga","anil","kapil","malli");
//		List<Character> firstChar=words.stream()
//			.map(s->s.charAt(0))
//				.collect(Collectors.toList());
//		
//	       System.out.println(firstChar);
	      
		
		
		  //middle letter
	       List<String> words=Arrays.asList("durga","anil","kapil","malli");	       
			List<StringBuffer> lastchar=words.stream()
				.map(str->new StringBuffer(str).reverse())
					.collect(Collectors.toList());
			
		       System.out.println(lastchar);
		

	}

}