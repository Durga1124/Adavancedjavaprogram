package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Employee20> a1=new ArrayList<Employee20>();
		System.out.println("enter the details of employee");
		
		for(int i=0;i<3;i++)
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
		}
        {
        for(Employee20 x:a1)
        	System.out.println(x.empid+""+x.name+""+x.designation+x.salary);
        }		
        
        
        		
    
        
        
	}

}
