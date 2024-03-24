package com.Lambda.Expersions;

interface Shape
{
	void draw();
}

public class LambdaExpersionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape rect=()->System.out.println("draw the method of Rectangle");
		rect.draw();
		
		Shape tria=()->System.out.println("draw the method of Triangle");
		rect.draw();
		
		Shape cir=()->System.out.println("draw the method of Circle");
		rect.draw();
		
		display(()->System.out.println("draw the method of Rectangle "));
		display(()->System.out.println("draw the method of Triangle "));
		display(()->System.out.println("draw the method of Circle "));
		
		//display(rect); //calling method
		//display(tria);
		//display(cir);
	}
	
	private static void display(Shape shape)
	{   shape.draw();
	}

}

    //from abtract method fib.srong,armstrong,perfect using lambda expersions 