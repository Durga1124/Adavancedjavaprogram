package expectionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable
      {
	
	private Vechile model_no;
	private int bhp;
	public Car(Vechile model,int bhp)
	{
		model=model;
		this.bhp=bhp;
	}
      }
class Vechile implements Serializable
{
	private int model_no;
	public Vechile (int model_no)
	{
		this.model_no=model_no;
		
	}
}


public class SerializedDemo2  {
	    public static void main(String[] args) {
			Vechile v=new Vechile(1134);
			Car c=new Car(v,256);
			
			try
			{
				
				FileOutputStream fs=new FileOutputStream("C:scrfiles/vehicleinfo.ser");
				ObjectOutputStream os=new ObjectOutputStream(fs);
						os.writeObject(c);
				os.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println(fnf.getMessage());
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
			
						
			}
					
		}
	