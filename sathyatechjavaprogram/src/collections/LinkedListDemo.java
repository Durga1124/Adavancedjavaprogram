package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		System.out.println(ll);
		
		ll.add(1,15);
		System.out.println(ll);
		
		ll.addFirst(5);
		System.out.println(ll);
		
		ll.addLast(35);
		System.out.println(ll);
		
//		ll.clear();
		System.out.println(ll);
		
		if(ll.contains(15))
			System.out.println("element exist in  the list");
		else
			System.out.println("does not exists");
		
		System.out.println(ll.get(1));
		
		System.out.println(ll.getFirst());
		
		System.out.println(ll.getLast());
		
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());		
			
		}
		
		System.out.println(ll.indexOf(10));
		
		ListIterator<Integer> litr=ll.listIterator(3);
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());			
		}
		
		ll.remove(3);
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		ll.set(0, 100);
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(110);
		al.add(120);
		
		LinkedList<Integer> lll=new LinkedList<>();
		
		System.out.println(111);
		
		
		
	}

}
