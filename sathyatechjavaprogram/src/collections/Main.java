package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee20> al=new ArrayList<Employee20>();
		
		Employee20 e1=new Employee20(123, "rahul", "software",48000.00f);
		Employee20 e2=new Employee20(125, "ravi", "developer",75000.00f);
		Employee20 e3=new Employee20(126, "krish","tester", 42000.00f);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		//for loop
		for(int i=0;i<al.size();i++)
		{
			Employee20 e=al.get(i);
			System.out.println(e.empid+""+e.name+""+e.designation+"e.salary");
		}
		for(int i=al.size()-1;i>=0;i--)
		{
			Employee20 e=al.get(i);
			System.out.println(e.empid+""+e.name+""+e.designation+"+e.salary");			
			
		}
			
		//for eachloop
		for(Employee20 x:al)
			System.out.println(x.empid+" "+"x.name"+""+x.designation+"x.salary");
		Iterator itr=al.iterator();
			 
		}
		
		
	}


