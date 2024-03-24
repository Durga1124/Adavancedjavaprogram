package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(13, "pen");
		hm.put(13, "pencil");
		hm.put(13, "sharpner");
		hm.put(13, "scale");
		hm.put(13, "divider");
		System.out.println(hm);
		System.out.println(hm.get(15));
		
		if(hm.isEmpty())
		System.out.println("map is empty");
		else
			System.out.println("map is not empty");
		hm.clear();
		System.out.println(hm);
		
		if(hm.containsKey(11))
		System.out.println("key exists in map");
		else
			System.out.println("key does not in map");
		
		Set<Integer> keys=hm.keySet();
		for(Integer key:keys)
		{
			String value=hm.get(keys);
			System.out.println(key+""+value);
		}
		
		hm.remove(12);
		System.out.println(hm);
		
		hm.replace(11,"compass box");
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		Collection<String> c=hm.values();
		for(String x:c)
			System.out.println(x);
				
		
		
		
		
	}

}
