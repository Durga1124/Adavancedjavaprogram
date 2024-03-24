package collections;

import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(221, "HDD");
		tm.put(220, "RAM");
		tm.put(214, "PROCESSOR");
		tm.put(218, "MOTHERBOARD");
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.headMap(220));
		System.out.println(tm.tailMap(219));
		System.out.println(tm.subMap(219, 221));
		
		//comparator comp=tm.comparator
		//System.out.println(comp);
		
		System.out.println(tm.floorKey(217));
		System.out.println(tm.lowerKey(219));
		System.out.println(tm.higherKey(220));
		System.out.println(tm.ceilingKey(222));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.descendingMap());
		
		
	}

}
