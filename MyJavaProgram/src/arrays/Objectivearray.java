package arrays;

public class Objectivearray {
	
public static void main(String[] args) {
	
	//objective Array is capable of saving different datatype values.
	//*The size of the Array is fixed
	Object array1 []= new Object[4];
	
   array1 [0]=10; 
   array1 [1]='A';
   array1 [2]= "selenium";
   array1 [3]=10.321435;
		  
		   for(int index=0; index<=3; index++)
		   {
			   System.out.println(array1[index]);
	
		   }
			System.out.println("*****");
			Object livetech[][]=new Object[2][2];
			livetech[0][0]="Venkat Sir";
			livetech[0][1]=50;
			livetech[1][0]='$';
			livetech[1][1]=100;
			for (int row=0; row<=1; row++)
			{
				for(int rowofcell=0; rowofcell<=1; rowofcell++)
				{
					System.out.println(livetech[row][rowofcell]+"/");
				}
				System.out.println();
			}
}
				
}
			
