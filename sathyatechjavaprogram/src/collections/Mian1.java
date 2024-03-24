package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mian1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee20> al=new  ArrayList<Employee20>();
		
		int id[]= {10,11,12};
		String name[]= {"karthik","anil","sujeeth","srujan"};
		String disgination[]= {"analyst","developer","tester","databasedev"};
		float salary[]= {25000,75000,35000,10000};
		
		for(int i=0;i<id.length;i++)
		{
			Employee20 e=new Employee20(id[i], name[i], disgination[i],salary[i]);
			
			al.add(e);
		}
		for(Employee20 x:al)
			System.out.println(x.empid+""+x.name+""+x.designation+""+salary);
		
		}
	
}
