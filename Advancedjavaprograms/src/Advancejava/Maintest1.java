package Advancejava;

 class Employee1
 {

	int empid;
	String empname;
	double empsalary;
	
	
	
	Employee1(int empid, String empname, double empsalary) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}



	@Override
	public String toString() 
	{
		return " [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}

 }

	public class Maintest1
	{
		public static void main(String[] args) 
		{
			Employee1 emp=new Employee1(1001,"mr.Ratan",116);
		
		System.out.println(emp);
			
		}
	}


	
	