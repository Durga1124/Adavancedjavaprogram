package collections;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		
		al.add(12354);
		al.add("rani is a vamshi wife's");
		al.add("45000.00");
		
		
		System.out.println(al);
		
		
		//collection with generics
		
		ArrayList<Float> al12=new ArrayList<Float>();
		al12.add(4552.25f);
		al12.add(445454.21f);
		
		System.out.println(al12);
		
		ArrayList<Boolean> al13=new ArrayList<Boolean>();
		al13.add(true);
		al13.add(false);
		
		System.out.println(al13);
		
		
		
		
		
		ArrayList<Integer> all=new ArrayList<Integer>();
		
		all.add(10);
		all.add(20);
		
		
		System.out.println(all);
		
		//collection with generic of object type
		
		ArrayList<Object> a12=new  ArrayList<Object>();
		
		a12.add(123);
		a12.add("gopal");
		a12.add(345.45f);
		
		System.out.println(a12);
		
		//downcasting
		
		Integer i=(Integer)a12.get(0);
		System.out.println(i);
		
		String s=(String)a12.get(1);
		System.out.println(s);
		
		float f=(float)a12.get(2);
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
