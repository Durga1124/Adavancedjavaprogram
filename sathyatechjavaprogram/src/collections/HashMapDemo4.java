package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String name[]= {"RAM","MOTHERBOARD","HDD","PROCESSOR"};
		Float price[]= {3500.00f,11500.00f,5500.00f,60000.00f};
		
		HashMap<String,Float> hm=new HashMap<String,Float>();
		
		for(int i=0; i<name.length;i++)
			
		{
			hm.put(name[i], price[i]);
			{
				
				while(true)				
				{
					System.out.println("1: ADD THE PRODUCT TO THE CART" );
					System.out.println("2: UPDATE THE PRODUCT IN THE CART");
					System.out.println("3: DIPLAY THE PRODUCT PRICES");
					System.out.println("4: DELETE THE PARTICULAR PRODUCT");
				
					System.out.println("enter your choice");
					int choice=sc.nextInt();
					
					switch (choice) {
					
					case 1: System.out.println("enter the product name");
					String name1=sc.next();
					if(hm.containsKey(name1))
					{
						System.out.println("product already exits");
					}
					else
					{
						System.out.println("enter the price of product");
						float price1=sc.nextInt();
						
						hm.put(name1, price1);
						
						System.out.println("product added Sucessfully");
					}
													
					break;
						
					case 2 : System.out.println("enter the product name");
					String name2=sc.next();
					if(hm.containsKey(name2))
					{
						System.out.println("enter the newprice for product" );
						float price2=sc.nextFloat();
						hm.replace(name2, price2);
						System.out.println("product updated");
					}
					else
						System.out.println("no such product name exists");
					break;
					
					case 3: Set<String> keys=hm.keySet();
					Iterator<String> itr=keys.iterator();
					while(itr.hasNext())
					{
						String key=itr.next();
						Float value3=hm.get(key);
						System.out.println(key+":"+value3);
						}
					break;
					
					case 4 : System.out.println("enter the product name");
                             String name3=sc.next();
                             if(hm.containsKey(name3))
                             {
                            	 hm.remove(name3);
                            	 System.out.println("product deleted");							
					          }
                             else
                            	 System.out.println("no such product existed");
						break;
						

					default: System.out.println("invalid option");
					}
					System.out.println("do you like a continue");
					char ch=sc.next().charAt(0);
					if(ch=='n')
						break;
					}
					
			}}}}
			
		
				
		
		


