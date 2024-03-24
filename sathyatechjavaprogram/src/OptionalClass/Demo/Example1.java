package OptionalClass.Demo;

import java.util.Arrays;
import java.util.Optional;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1=new Customer(101,"Sachin");
		Custmmoor custmor2=new customer(102,"null");
		String name=Customer2.getName(); //gives null
		
		//make uppercase
		name.toUpperCase(); //gives null pointer exception
		
		Optional<String> emailoptional=Optional.of(customer.getEmail());
		System.out.println(emailoptional);
		
		Optional<String> emailoptional2=Optional.ofNullable(customer.getEmail());
	}
	
		
	

}
