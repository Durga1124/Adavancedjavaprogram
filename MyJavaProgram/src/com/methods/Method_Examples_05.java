package com.methods;

public class Method_Examples_05 {

	// Global Variable / Instance Variables
	int var1=50;
	int var2=15;

	public void addition()// User Defined Method withOut parameters
	{
	// Local variables
	int var1=30;
	int var2=20;
	int var3;
	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}

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
	// int var2=20;
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

	Method_Examples_05 m5 = new Method_Examples_05();
	m5.addition();
	m5.addition_GlobalVariableValues();
	m5.addition(100, 50);
	m5.addition(100, 200, 300);
	m5.subtraction();
	}

	}


