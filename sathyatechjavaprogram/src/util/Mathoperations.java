package util;

import java.util.Scanner;

public class Mathoperations {

	public void addition()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("addition of a and b="+c);				
	}
	public void substraction()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("substraction of a and b="+c);				
	}
	public void multiplication()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("multiplication of a and b="+c);				
	}
	public void divison()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("divison of a and b="+c);				
	}
}
