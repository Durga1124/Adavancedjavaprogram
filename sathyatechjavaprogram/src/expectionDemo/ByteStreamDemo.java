package expectionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("C:/my files/rose1.jpg");
			int ch;
			while ((ch=fis.read()) !=-1)
				System.out.print((char)ch);
			System.out.println("file opened");
		}
		catch(FileNotFoundException fne)
	
		{
			System.out.println(fne.getMessage());
		}
		finally
		{
			if(fis!=null)
			{
				fis.close();
				
			}
			
		}
	}
}
