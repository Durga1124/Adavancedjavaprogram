package com.Inheritance;

public class Test2 extends Test1 {

		// Inheritance Uses extends KeyWord

		protected void multiplication()
		{

		int var1=30;
		int var2=20;
		int var3;

		var3=var1*var2;
		System.out.println(" The value of the variable var3 after Multiplication is :- "+var3);
		}

		public static void main(String[] args) {

		Test2 t2 = new Test2();
		t2.multiplication();
		t2.division();
		t2.addition();
		t2.subtraction();

		/*
		Test1 t1 = new Test1();
		t1.addition();
		*/
		// Without creating an object for Test1 Java Class - Directly using the Test2 class
		// object calling the methods of the Test1 Java Class
		//t2.addition();

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


		
	}


