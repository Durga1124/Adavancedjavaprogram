package expectionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
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

public class DeSerializationDemo {

	public static void main(String[] args) throws Exception {

		{
			FileInputStream fis=null;
			ObjectInputStream ois=null;
			
			try
			{
				fis=new FileInputStream("C:/scr files/emp.Ser");
				ois=new ObjectInputStream(fis);
				
				Employee e=(Employee)ois.readObject();
	
						
				System.out.println(e.empid+""+e.name+""+e.salary+" ");
				
				
			}
			catch(FileNotFoundException fne)
			{
				System.out.println(fne.getMessage());
			}
			finally
			{
				if(fis!=null)
				{
					fis.close();
				}
				if(ois!=null)
				{
					ois.close();
				}
				
				}
			}
		}
	}


