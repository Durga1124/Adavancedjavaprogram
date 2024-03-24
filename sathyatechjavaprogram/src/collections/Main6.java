package collections;
import java.util.*;
public class Main6 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Employeepojo> al=new ArrayList<Employeepojo>();
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<6;i++)
			{
				System.out.println("Enter the employee details:");
				int id=sc.nextInt();
				String name=sc.next();
				float sal=sc.nextFloat();
				int deptno=sc.nextInt();
				String loc=sc.next();
				
				Employeepojo e=new Employeepojo();
				e.setId(id);
				e.setName(name);
				e.setSalary(sal);
				e.setDeptno(deptno);
				e.setLocation(loc);
				
				al.add(e);
			}
			for(Employeepojo ele:al)
				System.out.println(ele.getId()+" "+ele.getName()+" "+ele.getSalary()+" "+ele.getDeptno()+" "+ele.getLocation());
			
			//employee details with id-103
			System.out.println("\nEmployee details with id=103");
			for(Employeepojo ele1:al)
			{
				if(ele1.getId()==103)
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
			//employee details of location hyderabad
			System.out.println("\nEmployee details of location hyderabad");
			for(Employeepojo ele1:al)
			{
				if(ele1.getLocation().equals("hyderabad"))
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
			//employee details of dept 20 or 30
			System.out.println("\nEmployee details of deptno 20 or 30");
			for(Employeepojo ele1:al)
			{
				if(ele1.getDeptno()==20 || ele1.getDeptno()==30)
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
			//employee details of location other than hyderabad
			System.out.println("\nEmployee details of location other than hyderabad");
			for(Employeepojo ele1:al)
			{
				if(!(ele1.getLocation().equals("hyderabad")))
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
			
			
			//employee details of dept 20 but does not belongs to hyderabad
			System.out.println("\nEmployee details of deptno 20 but does not belongs to hyderabad location");
			for(Employeepojo ele1:al)
			{
				if(ele1.getDeptno()==20 && !(ele1.getLocation().equals("hyderabad")))
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
			
			//count number of employees working in hyderabad and banglore city
			int count=0;
			for(Employeepojo ele1:al)
			{
				if(ele1.getLocation().equals("hyderabad") || ele1.getLocation().equals("banglore"))
					count++;
			}
			if(count==0)
				System.out.println("\n no such record exists");
			else
				System.out.println("\nnumber of employees working in hyderabad and banglore city are "+count);
			
			
			
			//check if the record having the employee name dravid
			boolean found=false;
			for(Employeepojo ele1:al)
			{
				if(ele1.getName().equals("dravid"))
				{
					found=true;
					break;
				}
			}
			if(found)
				System.out.println("\nEmployee dravid record is present");
			else
				System.out.println("\nEmployee dravid record is not present");
			
			
			//details of an employee whose salary is greater than 30000
			System.out.println("\nDetails of an employee whose salary is greater than 30000");
			for(Employeepojo ele1:al)
			{
				if(ele1.getSalary()>30000)
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
			
			
			//details of an employee whose salary is between 30000 to 40000
			System.out.println("\nDetails of an employee whose salary is between 30000 to 40000");
			for(Employeepojo ele1:al)
			{
				if(ele1.getSalary()>30000 && ele1.getSalary()<40000)
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
			
			
			//details of an employee whose salary is less than 30000 and does not belongs to hyderabad
			System.out.println("\nDetails of an employee whose salary is less than 30000 and does not belongs to hyderabad");
			for(Employeepojo ele1:al)
			{
				if(ele1.getSalary()<30000 && !(ele1.getLocation().equals("hyderabad")))
					System.out.println(ele1.getId()+" "+ele1.getName()+" "+ele1.getSalary()+" "+ele1.getDeptno()+" "+ele1.getLocation());
			}
			
	 	}

	}
 // 1.write a java program  array list operations create,read,insert,update,delete,reverse 
 //2.write a javaprogram to performing the following operations such as adding the employee details 
//into array list displaying emp id details specific removing particular details 2
//101 sachin 30000.0 10 hyderabad
//102 dravid 35000.0 20 chennai
//103 kapil 40000.0 10 pune
//104 rahul 20000.0 10 hyderabad
//105 dhoni 600000.0 30 hyderabad
//106 dravid 75000.0 20 banglore
	


