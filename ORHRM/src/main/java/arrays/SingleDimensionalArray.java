package arrays;

public class SingleDimensionalArray {
	
	

	public static void main(String[]args) {
		
		
		int array1[]=new int[8];
			array1[0]=10;
			array1[1]=20;
			array1[2]=30;
			array1[3]=40;
			array1[4]=50;
			array1[5]=60;
			array1[6] = 70;
			
			System.out.println(array1.length);
		
			
			for(int index=0; index<array1.length; index++) {
				  System.out.println(array1[index]);
			}
			
		}
	}

