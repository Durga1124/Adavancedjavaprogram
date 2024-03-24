package com.Inheritance;

public class Test3  extends Test2 {

	// Global Variable / Instance Variables
	int var1=50;
	int var2=15;

	public void addition_GlobalVariableValues() // User Defined Method withOut parameters
	{
	// Local variables
	// int var1=30;
	//int var2=20;
	int var3;
	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}

	/*

	Method overloading in java is a feature that allows a class to have more
	than one method with the same name,
	but with different parameters
	*/
	public void addition(int var1,int var2) // User Defined Method with Parameters
	{
	// Local variables
	// int var1=30;
	// int var2=20
	int var3;
	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}

	public void addition(int var1,int var2,int var3) // User Defined Method with Parameters
	{
	// Local variables
	// int var1=30;
	// int var2=20;
	int var4;
	var4=var1+var2+var3;
	System.out.println(" The value of the variable var1 is :- "+var1);
	System.out.println(" The value of the variable var2 is :- "+var2);
	System.out.println(" The value of the variable var3  is :- "+var3);
	System.out.println(" The value of the variable var4 after Addition is :- "+var4);
	}


	public void subtraction()
	{
	int var3;
	var3=var1-var2; // variables assigned Globally will be taken under consideration
	System.out.println(" The value of the variable var3 after Subtraction is :- "+var3);
	}


	public static void main(String[] args) {

	Test3 t3 = new Test3();

	System.out.println(" ========= Methods of Test3 Class ==============");
	t3.addition(20, 30);
	t3.addition(50, 100, 150);
	t3.addition_GlobalVariableValues();
	t3.subtraction();

	System.out.println();
	System.out.println(" ========= Methods of Test2 Class ==============");
	System.out.println();

	t3.multiplication();
	t3.division();
	// WithOut creating the Object for the Test1 Java Class - we are able to access
	//   the methods of the Test1 Java Class with the Test3 Class Object(t3) -
    //   is because Test2 Class is internally extends with Test1 Java Class

	// Directly accessing the Extended Extended Java Class Methods
	System.out.println();
	System.out.println(" ========= Methods of Test1 Class ==============");
	System.out.println();

	t3.addition();

	}


	}


