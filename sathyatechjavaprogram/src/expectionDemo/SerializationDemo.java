package expectionDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int empid;
	String name;
	float salary;
	transient int SSN;
	public Employee(int empid, String name, float salary, int sSN) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		SSN = sSN;
	}
	
	}
	
public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		Employee e=new Employee(123,"sachin",45000,453434);
		
		try
		{
			fos=new FileOutputStream("C:/scrfiles/emp.Ser");
			oos=new ObjectOutputStream(fos);
			oos.writeObject((Object)e);
		}
		catch(FileNotFoundException fne)
		{
			System.out.println(fne.getMessage());
		}
		finally
		{	
			if(oos!=null)
			{
				oos.close();
		
			}
			if(fos!=null)
			{
				fos.close();
			}
				
		}
		
	}
}

