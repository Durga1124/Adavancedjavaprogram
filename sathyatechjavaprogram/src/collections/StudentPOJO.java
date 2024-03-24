package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentPOJO {
	
	int empid;
	String name;
	int age;
	String  branch;
	
	
		public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

		public static void main(String[] args) {
			
			ArrayList<StudentPOJO> al=new ArrayList<StudentPOJO>();
			Scanner sc=new Scanner(System.in);
			
			while(true)
			{
				System.out.println("Enter the student details:");
				int id=sc.nextInt();
				String name=sc.next();
				String age=sc.next();
				String branch=sc.next();
					
				StudentPOJO e=new StudentPOJO();
				e.setEmpid(id);
				e.setName(name);
				e.setAge(age);
				e.setBranch(branch);
				
				al.add(e);
				System.out.println("Do you want to continue?");
				String choice=sc.next();
				
				if("no".equalsIgnoreCase(choice))
					break;
			}
			while(true)
			{
				System.out.println("append: to append the student details");
				System.out.println("insert: to insert the student details at a particular index");
				System.out.println("remove: to remove the student details");
				System.out.println("display: to display the student details");
				System.out.println("Enter your choice:");
				String choice=sc.next();
				switch(choice)
				{
				case "append": append(al);
								break;
				case "insert": insert(al);
								break;
				case "update": update(al);
								break;
				case "remove": remove(al);
								break;
				case "display":	display(al);
								break;
					
				}
				System.out.println("Do you want to continue(append/insert/update/remove/display)?");
				String choice1=sc.next();
				
				if("no".equalsIgnoreCase(choice1))
					break;
			}
		}

		private void setAge(String age2) {
			// TODO Auto-generated method stub
			
		}

		private static void append(ArrayList<StudentPOJO> al) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);

				System.out.println("Enter the student details:");
				int id=sc.nextInt();
				String name=sc.next();
				int age=sc.nextInt();
				String branch=sc.next();
				
				StudentPOJO e=new StudentPOJO();
				e.setEmpid(id);
				e.setName(name);
				e.setAge(age);
				e.setBranch(branch);
				
				al.add(e);
		}

		private static void insert(ArrayList<StudentPOJO> al) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the location you want to insert the student details at: ");
			int loc=sc.nextInt();
				System.out.println("Enter the student details:");
				int id=sc.nextInt();
				String name=sc.next();
				int age=sc.nextInt();
				String branch=sc.next();
				
				StudentPOJO e=new StudentPOJO();
				e.setEmpid(id);
				e.setName(name);
				e.setAge(age);
				e.setBranch(branch);
				
				al.add(loc,e);
		}

		private static void update(ArrayList<StudentPOJO> al) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id you want to update: "); 
			int upid=sc.nextInt();
			int ind=al.indexOf(upid);
			System.out.println("enter(id or name or age or branch) you want to update for the "+upid+" id:");
			String s=sc.next();
			switch(s)
			{
			case "id":
						System.out.println("Enter the new id: ");
						int nid=sc.nextInt();
						al.get(ind).setEmpid(nid);
						break;
			case "name":
						System.out.println("Enter the new name: ");
						String nname=sc.next();
						al.get(ind).setName(nname);
						break;
			case "age":
						System.out.println("Enter the new age: ");
						int nage=sc.nextInt();
						al.get(ind).setAge(nage);
						break;
			case "branch":
						System.out.println("Enter the new branch: ");
						String nbranch=sc.next();
						al.get(ind).setBranch(nbranch);
						break;
			}
		
		}
		private static void remove(ArrayList<StudentPOJO> al) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id you want to remove the details: "); 
			int upid=sc.nextInt();
//			int ind=al.indexOf()
			al.remove(upid);
		}

		private static void display(ArrayList<StudentPOJO> al) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("1: to display all the students details");
			System.out.println("2: to display one student details with id");
			System.out.println("3: to display one student details with name");
			System.out.println("4: to display one student details with branch");
			System.out.println("Enter your choice: ");
			int dischoice=sc.nextInt();
			switch(dischoice)
			{
			case 1:
					for(StudentPOJO x:al)
						System.out.println(x.getEmpid()+" "+x.getName()+" "+x.getAge()+" "+x.getBranch());
					break;
			case 2:
					System.out.println("Enter the id: ");
					int disid=sc.nextInt();
					for(StudentPOJO x:al)
					{
						if(x.getEmpid()==disid)
							System.out.println(x.getEmpid()+" "+x.getName()+" "+x.getAge()+" "+x.getBranch());
						else
							System.out.println("Invalid ID");
					}
					break;
			case 3:
					System.out.println("Enter the name: ");
					String disname=sc.next();
					for(StudentPOJO x:al)
					{
						if(x.getName().equals(disname))
							System.out.println(x.getEmpid()+" "+x.getName()+" "+x.getAge()+" "+x.getBranch());
						else
							System.out.println("Invalid Name");
					}
					break;
			case 4:
					System.out.println("Enter the name: ");
					String disbranch=sc.next();
					for(StudentPOJO x:al)
					{
						if(x.getName().equals(disbranch))
							System.out.println(x.getEmpid()+" "+x.getName()+" "+x.getAge()+" "+x.getBranch());
						else
							System.out.println("Invalid Branch");
					}
					break;	
			}
		}

	
	}


     
//101 sachin 20 mech
//102 dravid 21 civil
//103 kapil 22 cse
//104 rahul 21 it
//105 dhoni 20 ece
//106 dravid 21 civil

