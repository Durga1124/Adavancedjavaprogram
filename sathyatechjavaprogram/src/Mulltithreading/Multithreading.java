package Mulltithreading;

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable di=()->
		{
			for(int i=1; i<=5;i++)
			{
				System.out.println("GOOD MORNING");
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
				}
				
				};
				
						Runnable d2=()->
						{
							System.out.println("GOOD EVENING");
						}
		}
	}

}
