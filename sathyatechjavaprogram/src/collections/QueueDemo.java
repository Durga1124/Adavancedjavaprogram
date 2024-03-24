package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// implementation class of 
		
		/*Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.element());
		
		q.remove();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		//implementation class of priority Queue
		
		/*Queue<Integer> q=new PriorityQueue<Integer>();
		
		q.add(30);
		q.add(10);
		q.add(20);
		q.add(50);
		q.add(70);
		
		System.out.println(q);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();*/
		
		Deque<Integer> q=new ArrayDeque<Integer>();
		
		q.add(30);
		q.add(10);
		q.add(20);
		q.add(50);
		q.add(40);
		
		q.addFirst(5);
		q.addLast(55);
		
		System.out.println(q);
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		
		q.pollFirst();
		System.out.println(q);
		
		q.pollLast();
		System.out.println(q);
	}

}
