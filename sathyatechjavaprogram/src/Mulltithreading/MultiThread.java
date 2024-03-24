package Mulltithreading;
import java.lang.*;

class Demo1  {

	public void run()
	{
		for(int i=1;i<=5; i++)
		{
			System.out.println("GOOD MORNING");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {
		}
	}
	}
		 class Demo2 extends Thread{
			public void run()
			{
				for(int i=1;i<=5; i++)
				{
					System.out.println("GOOD EVENING");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e) {
				}
			}
			}
		 }

public class MultiThread {

	
	public static void main(String[] args) {
	
		Demol d1=new Demol();
        Demo2 d2=new Demo2();
        
        d1.run();
        d2.run();
         
         d1.start();
         try
         {
        	 Thread.sleep(1000);
         }
         catch(Exception e)
         {
        	 
         }
	  d2.start();
	
	}

}

}
