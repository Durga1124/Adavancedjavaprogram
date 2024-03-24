package com.java8features;
import java.util.function.BiFunction;
class BiFunimp1 implements BiFunction<String, String, Boolean>
{
	@Override
	public Boolean apply(String t,String u) {
		return t.equals(u);
		
	}
}


public class BiFunctiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Traditional expression approach
		
		BiFunction<String, String, Boolean> bif=new BiFunimp1();
		System.out.println(bif.apply("sachin"
				, "rahul"));
		
		//sachin is 6 letters and rahul is 5 letters so is false
		//lambda expression approach
		
		BiFunction<String, String, Boolean> bif1=(t,u)->
		{
			return  t.equals(u);
		};
		
		System.out.println(bif1.apply("sathya", "sathya"));
 
		//sathya is 6 letters and sathya is 6 letters so is true
	}

}
