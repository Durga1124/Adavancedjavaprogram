package expectionDemo;


import java.io.*;

public class DataStreammDemo 
{

	public static void main(String[] args) throws IOException
	{

	int rolno=1;
	String name="prasad";
	float marks=456.00f;
	
	try
	{
	FileOutputStream fos=new FileOutputStream("‪C://Users//durga//OneDrive//Desktop//Movies/Demo.txt");
			DataOutputStream dos=new DataOutputStream(fos);
			
			dos.writeInt(rolno);
			dos.writeUTF(name);
			dos.writeFloat(marks);
			
		     dos.close();
	     
		     FileInputStream fis=new FileInputStream("‪C://Users//durga//OneDrive//Desktop//Movies/Demo.txt");
		     DataInputStream dis=new DataInputStream(fis);
		     
		     int rno=dis.readInt();
		     String nm=dis.readUTF();
		     float  mks=dis.readFloat();
		     
		     
		     System.out.println(rno+" "+nm+" "+mks);
		     
		     dis.close();
	}
	
	catch(FileNotFoundException fne)
	{
		System.out.println(fne.getMessage());
		
		
	}

}
}    		  
		    		 
			
			
			

