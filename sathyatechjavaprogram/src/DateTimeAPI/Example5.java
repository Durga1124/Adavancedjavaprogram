package DateTimeAPI;

import java.time.LocalDate;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date=LocalDate.now();
		LocalDate  futureDate=date.plusDays(10);
		System.out.println("Future Date:" +futureDate);
	}

}
