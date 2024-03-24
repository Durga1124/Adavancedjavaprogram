package com.prasad.jdbc;

import java.util.List;

public class Clientdata {

	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
	    int res1=employeeDao.save(new Employee(1001,"akhil",1000));
		System.out.println("Data inserted successfully.."+res1);
		int res2=employeeDao.save(new Employee(1002,"akash",10000));
		System.out.println("Data inserted successfully.."+res2);
		int res3=employeeDao.save(new Employee(1003,"ravi",2000));
		System.out.println("Data inserted successfully.."+res3);
		int res4=employeeDao.save(new Employee(1004,"naidu",1000));
		System.out.println("Data inserted successfully.."+res4);
		int res5=employeeDao.save(new Employee(1005,"madhu",100));
		System.out.println("Data inserted successfully.."+res5); 
		
		//findById
		Employee employee=employeeDao.findById(1001);
			System.out.println(employee); 
			
		
		//deleteById
		int emp=employeeDao.deleteById(1001);
		if(emp==0) {
			System.out.println("Data deleted successfully..");
		}
		else {
			System.out.println("Deletion failed..");
		} 
		
		//deleteBySalary
		int emp1=employeeDao.deleteBySalary(10000);
		if(emp1>0) {
			System.out.println("Salary Deleted successfully..");
		}
		else {
			System.out.println("Deletion Failed..");
		}
		
		//findAll
		  List<Employee> emp2=employeeDao.findAll();
		for(Employee x:emp2) {
			System.out.println(x);
		}
		//or
			emp2.forEach(System.out::println);
		
			
		
		
		//updateSalary
	int count=employeeDao.updateSalary(1000, 100);
		System.out.println(count+"rows affected"); 
	
	}

}
	
	
