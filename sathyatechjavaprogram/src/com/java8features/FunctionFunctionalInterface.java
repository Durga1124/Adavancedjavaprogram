package com.java8features;
import  java.util.*;
import java.util.function.Function;
     class funimp1 implements Function<String,Integer>
     {
    	 @Override
    	 public Integer apply(String t) {
    		 return t.length();
    	 }
     }
public class FunctionFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//traditional approach
		Function<String, Integer> f=new funimp1();
		System.out.println(f.apply("welcome to java"));
		
		//lambda expression approach
		Function<String, Integer> f1=(t)->
		{
			return t.length();
		};
		System.out.println(f1.apply("happycoding"));
		
		
	}

}
