package expectionDemo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File f=new File("./reume.txt");
	
	//File f=new File("C:\Users\durga\eclipse-workspace\sathyatechjavaprogram");
	//System.out.println(f.getName());
	//System.out.println(f.getParent());
	//File f2=new File(f.getParent()+"/resume2docx");
	//System.out.println(f.getAbsolutePath());
	//System.out.println(Arrays.toString(f.list()));
	//folder creation purpose -File f=new File("./Resources/");
	//System.out.println(f.mkdir());
	if(f.exists())
		f.delete();
	//folder creation purpose -File f=new File("./Resources/Test/");
	//System.out.println(f.mkdirs());
		if(f.exists())
			f.delete();
	System.out.println(f.createNewFile());
	//System.out.println(f.canWrite());
	//f.setWritable(true);
	//System.out.println(f.canWrite());
	//System.out.println(f.isHidden());
	//System.out.println(f.exists());
	//f.createNewFile();
	//System.out.println(f.delete());
	//System.out.println(f.createNewFile());
	//System.out.println(f.lastModified());
	//System.out.println(new  Date(f.lastModified()));
	//System.out.println(f.isDirectory());
	
	}

}
