package geometry;

import java.util.Scanner;

public class Circle {

	 public void area()
	 {
		 Scanner sc=new Scanner(System.in);
		 int radius;
		 float area;
		 
		  System.out.println("enter the radius of circle");
		  radius=sc.nextInt();
		  area=3.14f*radius*radius;
		  System.out.println("area of circle:"+area);
	 }
	 public void perimeter()
	 {
		 Scanner sc=new Scanner(System.in);
		 int radius;
		 float perimeter;
		 
		  System.out.println("enter the radius of circle");
		  radius=sc.nextInt();
		  perimeter=2*3.14f*radius;
		  System.out.println("perimeter of circle:"+perimeter);
	 } 
}
