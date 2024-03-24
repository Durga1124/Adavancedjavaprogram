package com.Lambda.Expersions;
import java.util.*;


interface first{
	void m1();  //Abstract method
	static void m2() //static method
	{
		System.out.println("static method of first interfacce");
	}
	default void m3() //default method
	{
		System.out.println("default method of first interfacce");
	}
}

     class Second implements first
     {
    	 public void m1()
    	 {
    		 System.out.println("abstract method implements of first interface");
    	 }
     }
    
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		first f=new Second();
		f.m1();
		f.m3();
		first.m2();
		
	}

}
