package Mulltithreading;
import java.io.EOFException;
import java.lang.*;

class A1 implements Runnable {

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
}
			 class A2 implements Runnable{
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

public class MutliExample2 {

	public void main(String[] args) {
		Runnable d1=new A1();
		Runnable d2=new A2();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		
		t1.start();
		try
		{
			Thread.sleep(1000);
		}
			 catch(Exception e)
	         {
	        	 
	         }
		  t2.start();
		
		}
}
			