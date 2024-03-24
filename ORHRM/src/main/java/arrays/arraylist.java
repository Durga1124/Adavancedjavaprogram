package arrays;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		//ArrayList is a dynamic structure, capable of saving any datatype values
		//There is no declaration of size of an ArrayList As we keep on adding the values stored into the index of ArrayList
		
		List <Object> arrayList1=new ArrayList();
		
		arrayList1.add(100);
		arrayList1.add("Selenium");
		arrayList1.add(10.1234);
		arrayList1.add('s');
		
		for(int index=0; index<arrayList1.size(); index++)
		{
			System.out.println(arrayList1.get(index));	
		}
	    //for each loop is used to iterate over arrays and such collections 
		//syntax;
		//for (declaration;expression){
		// statements 
		//}
		
	
		System.out.println("******for each loop*****");
	
	       for(Object index:arrayList1){
		   System.out.println(index);
	  }
	}
	}
	

