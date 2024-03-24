package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		String liveTech[][]=new String[2][2];
		liveTech [0][0]="Venkat Sir";
		liveTech [0][1]="Manual Testing";
		liveTech [1][0]="Srini sir";
		liveTech [1][1]="Automation Testing";
		
		System.out.println(liveTech.length);
		
		for (int row=0; row<liveTech.length; row++)
		{
			for(int rowofcell=0; rowofcell<liveTech.length; rowofcell++)
			{
				System.out.print(liveTech [row]
						[rowofcell]+"/");
			}
			System.out.println();
		}
		
	}
}
