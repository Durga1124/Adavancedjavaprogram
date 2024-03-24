package school;

public class Student {
 
	 public void sdetails()
	 {
		 int rollno[]= {101,102,103,104,105};
		 String name[]= {"prasad","krishna","ravi","lova","ganesh"};
		 String sub= "english,maths,social,science,hindi";
		 System.out.println("teacher details");
	     for(int i=0;i<name.length;i++)
		 {
			 System.out.println(rollno[i]+":"+name[i]+" "+sub);
		 }
	 }
}


