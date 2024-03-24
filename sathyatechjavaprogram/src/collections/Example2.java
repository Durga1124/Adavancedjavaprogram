package collections;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		ArrayList<Integer> al2=(ArrayList<Integer>)al1.clone();
		System.out.println(al2);
	}

}
