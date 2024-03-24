package expectionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDeamo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try
		{
			fis=new  FileInputStream("C:/my files/rose1.jpg");
			fos=new FileOutputStream( "C:/my files/rose2.jpg");
			int ch;
			while ((ch=fis.read()) !=-1)
				fos.write((char)ch);
			System.out.println("file copied");
		}
		catch(FileNotFoundException fne)
	
		{
			System.out.println(fne.getMessage());
		}
		finally
		{
			if(fis!=null)
			{
				fos.close();	
			}
			if(fos!=null)
			{
				fos.close();	
			}
			
			
		}
	}

		}
		
	

