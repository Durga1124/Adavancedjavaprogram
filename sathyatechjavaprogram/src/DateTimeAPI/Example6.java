package DateTimeAPI;

import java.time.LocalDate;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date1=LocalDate.of(2023, 12, 23);
		LocalDate date2=LocalDate.of(2023, 12, 22);
		
		System.out.println("Is date1 before date??" +date1.isBefore(date2));
		System.out.println("Is date1 after date??" +date1.isAfter(date2));
	}

}
