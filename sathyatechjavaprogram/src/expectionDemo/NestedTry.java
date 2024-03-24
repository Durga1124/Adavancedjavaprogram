package expectionDemo;

public class NestedTry {

	
	public static void main(String[] args) {
		try
		{
			int a=1;
			int b=42/a;
			System.out.println("A="+b);
			
			try
			{
				if(a==1)
				a=a/(a-a);
				if(a==2)
				{
					int c[]= {1};
					c[4]=99;
					}
			}
						catch(ArrayIndexOutOfBoundsException ae)
						{
							System.out.println("Sorry..... Array Is Out Of Bonus");
						}
						}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				
			}
		}
	
	}
