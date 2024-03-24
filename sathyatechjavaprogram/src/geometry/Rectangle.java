package geometry;

import java.util.Scanner;

public class Rectangle {


	 public void area()
	 {
		 Scanner sc=new Scanner(System.in);
		 int l,b,area;
		 
		 
		  System.out.println("enter the length and breadth of rectangle");
		  l=sc.nextInt();
		  b=sc.nextInt();
		  area=l*b;
		  System.out.println("area of reactangle:"+area);
	 }
	 public void perimeter()
	 {
		 Scanner sc=new Scanner(System.in);
		 int l,b,perimeter;
		 
		 
		  System.out.println("enter the length and breadth of perimeter");
		  l=sc.nextInt();
		  b=sc.nextInt();
		  perimeter=l*b;
		  System.out.println("area of reactangle:"+perimeter);
	 }
}


