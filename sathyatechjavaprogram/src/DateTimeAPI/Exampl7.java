package DateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exampl7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date1=LocalDate.of(2023, 7, 24);
		LocalDate date2=LocalDate.of(2023, 12, 31);
		
		long daysDifference=ChronoUnit.DAYS.between(date1, date2);
		System.out.println("Days Difference:"+daysDifference);
	}

}