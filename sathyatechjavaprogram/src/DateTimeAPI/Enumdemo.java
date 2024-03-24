package DateTimeAPI;
import java.io.*;

  
  enum Demo
  {
	  LOW,MEDIUM,HIGH
  }

  enum Week
  {
	  MONDAY,TUESDAY,WEDNESDAY,THURSDAY
  }
  enum Months
  {
	  JANAUARY,MARCH,APRIL
  }
  enum Directions
  {
	  SOUTH,NORTH,EAST,WEST
  }
public class Enumdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo D=Demo.LOW;
		System.out.println(D);
		
		Week w=Week.MONDAY;
		System.out.println(w);
		
		Months m=Months.JANAUARY;
		System.out.println(m);
		
		Directions d=Directions.SOUTH;
		System.out.println(d);
		
	}

}
