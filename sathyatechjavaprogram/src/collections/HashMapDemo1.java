package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[]= {"JAVA","ORACLE","SPRING FRAME","HTML","CSS"};
		float price[]= {456.00f,556.00f,756.00f,467.00f,340.00f,600.00f};
		
		HashMap<String,Float> hm=new HashMap<String,Float>();
		
		for(int i=0; i<name.length;i++)
		{
			hm.put(name[i], price[i]);			
		}
		
		Set<String> keys=hm.keySet();
		
		
		Iterator<String> itr=keys.iterator();
		
		while(itr.hasNext());
		
			String key=itr.next();
			Float value=hm.get(key);
			System.out.println(key+":"+value);
			
		}
				
		
				
	}


