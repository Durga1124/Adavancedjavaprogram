package expectionDemo;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CharacterStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr =null;
		BufferedReader br=null;
		try
		{ 
			fr=new FileReader("C:/my files/samplea1.txt");
			br=new BufferedReader(fr);
			
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
		}
		catch(FileNotFoundException fne)
		
		{
			System.out.println(fne.getMessage());
		}
			finally
			{
				if(br!=null)
				{
					br.close();
					
				}
				if(fr!=null)
				{
					fr.close();
			}
		}
		
	}

}
