package expectionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			fis=new FileInputStream("C:\\my files\\sample1.txt");
		    fos=new FileOutputStream("C:\\my files\\sample2.txt");		
		    int ch;
		    while((ch=fis.read())!=-1)
		    {
		    	fos.write((char)ch);
		    }
		    System.out.println("file opened");
		}
		catch(FileNotFoundException fne)
		{
			fne.printStackTrace();
		}
		finally
		{
			if(fis!=null)
				fis.close();
			if(fos!=null)
				fos.close();
		
		
		    }
		    
		}
	}


