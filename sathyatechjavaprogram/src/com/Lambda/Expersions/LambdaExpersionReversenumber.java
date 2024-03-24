package com.Lambda.Expersions;
 interface reverse
 {
	 void number();
 }

public class LambdaExpersionReversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse r=()->{
	    int n=987654321;
		int prod=0;
		while(n>0)
		{
			int rem=n%10;
			prod=prod*10+rem;
			n=n/10;
			
		}
	System.out.println(prod);
		};	

		r.number();
}
}