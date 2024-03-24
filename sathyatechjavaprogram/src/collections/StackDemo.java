package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		s.pop();
		
		System.out.println(s.peek());
		
		if(s.isEmpty())
			System.out.println("stack is empty");
		else
			System.out.println("stack is not empty");
		
		System.out.println(s.search(40));
		System.out.println(s.search(10)); 
		
	}

}
