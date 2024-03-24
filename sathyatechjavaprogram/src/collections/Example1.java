package collections;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(40);
		System.out.println(al1);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(400);
		System.out.println(al2);
		
		al1.addAll(al2);
		
		System.out.println(al2);
	}

	}


