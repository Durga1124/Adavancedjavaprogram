package DateTimeAPI;

import java.time.LocalDate;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateString="2023-07-24";
		LocalDate date=LocalDate.parse(dateString);
		System.out.println("parsed Dtae:"+date);
		

	}

}
