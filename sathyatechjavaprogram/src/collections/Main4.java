package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		ArrayList<Employee20> a1=new ArrayList<Employee20>();
		
		while(true)
		
		{
			System.out.println("Enter the employee id");
	        int id=sc.nextInt();
	        System.out.println("Enter the employee name");
	        String name=sc.next();
	        System.out.println("Enter the employee disignation");
	        String disignation=sc.next();
	        System.out.println("Enter the employee salary");
	        float salary=sc.nextFloat();
	        
	        Employee20 e=new Employee20(id, name, disignation, salary);
	        
	        a1.add(e);
	        
	        System.out.println("do you want continue");
	        String choice=sc.next();
	        
	        if(choice.equals("no"))
	        	break;
		}
	}

}
