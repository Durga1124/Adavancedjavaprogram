package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		
	
			ArrayList<Employee20> a1=new ArrayList<Employee20>();
			try {
				while(true)
				{
			
			
			System.out.println("enter the employee id");
			int id=Integer.parseInt(br.readLine());
			
			System.out.println("enter the employee name");
			String name=br.readLine();
			
			System.out.println("enter the employee disignation");
			String disignation=br.readLine();
			
			System.out.println("enter the employee salary");
			float salary=Float.parseFloat(br.readLine());
			
			Employee20 e=new Employee20(id, name, disignation, salary);
			a1.add(e);
			
			System.out.println("do you want to continue");
			char ch=(char)br.read();
			
			if(ch=='n')
				break;
		}
		
		for(Employee20 x:a1)
			System.out.println(x.empid+""+x.name+""+x.designation+x.salary);
				
	}
	finally
	{
		if(br!=null)
		{
			br.close();
		}
		
	
			
	}		
				
	}
}
		
	


