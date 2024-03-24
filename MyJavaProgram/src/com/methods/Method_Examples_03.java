package com.methods;

public class Method_Examples_03 {

	protected void multiplication()
	{
	int var1=30;
	int var2=20;
	int var3;

	var3=var1*var2;
	System.out.println(" The value of the variable var3 after Multiplication is :- "+var3);
	}

	void division() // default Method
	{
	// Exception Handling -- try .. catch

	try
	{
	int var1=30;
	int var2=0;
	int var3;

	var3=var1/var2;
	System.out.println(" The value of the variable var3 after Division is :- "+var3);
	}
	catch(Exception errorMessage)
	{
	System.out.println(" The Expection is :- "+errorMessage);
	System.out.println(" Unable to perform the Operation Division");
	}
	}
	public static void main(String[] args) {

		System.out.println(" ********** MethodExample3 Class ********** ");
		Method_Examples_03 m3 = new Method_Examples_03();
		m3.multiplication();

		System.out.println();
		System.out.println(" ********** MethodExample3 Class ********** ");
		m3.division();

		System.out.println();
		System.out.println(" ********** MethodExample2 Class ********** ");
		Method_Examples_02 m2 = new Method_Examples_02();
		m2.addition();

	}

}
