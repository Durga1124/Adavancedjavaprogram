package DateTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime time=LocalTime.of(12, 34,56);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime=time.format(formatter);
		System.out.println("Formatted Time:"+formattedTime);
	}

}
