package expectionDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileReader fr=null;
	    BufferedReader br=null;
	    
		try
		{
			fr=new FileReader("C:/my files/sample1.txt");
		    br=new BufferedReader(fr);		
		    String str;
		    int count=0;
		    while((str=br.readLine())!=null)
		    {
		    	StringTokenizer st=new StringTokenizer(str);
		    	System.out.println(st.nextToken());
		    	count++;
		    }
		    System.out.println("nu'mber of words in a given file="+count);
		    System.out.println("number of first and last"); 
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
  	

	
	



		
	


