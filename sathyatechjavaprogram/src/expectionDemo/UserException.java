package expectionDemo;

class X extends Exception
{
	X(String message)
	{
		
	    super(message);
	    //this.messege=messege;
	}
}

        public class  UserException 
         {
	
		public static void main(String args[])
		{
			int x,y;
			x=50;
			y=2;
			try
			{
				int r;
				r=x*y;
				if(r>=100)
				{
					throw new X("You Are Right ");
				}
			}
			catch (X e)
			{
				System.out.println("Exception is caught");
				System.out.println(e.getMessage());
				
			}
			finally
			{
				System.out.println("finally block is always executed");
			}
		}
         }
	
