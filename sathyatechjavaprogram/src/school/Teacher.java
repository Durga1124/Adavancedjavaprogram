package school;

public class Teacher {
	public void tdetails()
	 {

		 int tid[]= {101,102,103,104,105};
		 String name[]= {"prasad","krishna","ravi","lova","ganesh"};
		 String sub= "english,maths,social,science,hindi";
		 System.out.println("teacher details");
		 
		 for(int i=0;i<tid.length;i++)
		 
		 {
			 System.out.println("teacher id"+":"+tid[i]+"teacher name"+":"+name[i]+"dealing subject"+":"+sub);
		 }
	 }
	public void tsubs()
	{
		System.out.println("teacher dealing subjects");
	}
	
}


