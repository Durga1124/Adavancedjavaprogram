package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example13 {

	public static void main(String[] args) {
		
		//inside map method new stream builder of
		List<String> list=new ArrayList<String>();
	    list.add("rahul");
	    list.add("kapil");
	    list.add("sachin");
	    list.add("shevag");
	    list.add("suryakumar");
	    list.add("kohli");
	    Stream<String> st=list.stream();
	    Stream<String> res=st.filter(s->s.startsWith("s"));
	    res.forEach(System.out::println);
				
	}

}
