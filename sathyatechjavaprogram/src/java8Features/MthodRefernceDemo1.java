package java8Features;
import java.util.*;
interface Shapeimp1
{
	Shapeimp1 getShape(int x);
}
class Shape
{
   int x;
   
public Shape(int x) {
	super();
	this.x = x;
}
   void area()//instance method
   {
	   System.out.println("area"+(x*x));
   }
}
public class MthodRefernceDemo1 {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		//implementing throughllambda expression
		/*Shapeimp1 si=(x)->
		return new Shape(x);
	};
	Shape shape=ai.getShape(20);
	shape.area();*/
		
		//refernce to a constructor
		Shapeimp1 si=Shape::new;
		Shape shape=si.getShape(20);
		shape.area();
		
	}
}
