package collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Map<Integer, Account> map=new HashMap<Integer,Account>();
		while(true);
		{
			System.out.println("1: ADD Account");
			System.out.println("2: UPDATE location");
			System.out.println("3: Display  Account");
			System.out.println("4: Remove Account");
			System.out.println("5: Quit");
			
			System.out.println("enter your choice : ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("enter Account number");
				Integer number=sc.nextInt();
				if(map.containsKey(number))
				{
					System.out.println("Account alraedy exits");
				}
				else
				{
					System.out.println("Enter name : ");
					String name=sc.next();					
					System.out.println("Enter the Balance");
					double balance=sc.nextDouble();
					System.out.println("Enter location");
					String location=sc.next();
					Account acc=new Account();
					acc.setNumber(number);;
					acc.setName(name);
					acc.setBalance(balance);
					acc.setLocation(location);
					map.put(number, acc);
					System.out.println("Account added");
				}
			}
				
			else if(ch==2)
			{
               
					System.out.println("Enter account number : ");
					int number=sc.nextInt();
					if(map.containsKey(number)){
						System.out.println("Enter  location : ");
						String locatiion=sc.next();
						Account acc=map.get(number);
						acc.setLocation(locatiion);
						System.out.println("Location updated");
					}
					else
						System.out.println("Error : Invalid acc-number");
                }
                else if(ch==3) {
                	System.out.println("Enter the account number");
                	int number=sc.nextInt();
                	
                    if(map.containsKey(number))
                    {
                     Account acc=map.get(number);
                     System.out.println("Details : "+acc.getName()+","+acc.getBalance()+","+acc.getLocation());
                    }
                    else
                    {
                	System.out.println("Errorr : invalid account");
                	
                    }
                   }
                
                else if(ch==4) {
                	System.out.println("Enter the account number");
                	int number=sc.nextInt();
                	if(map.containsKey(number)) {
                		map.remove(number);
                		System.out.println("Account Removed");
                	}
                	else
                		System.out.println("Error : Invalid Account  number");
                }
                else if(ch==5) {
                	System.out.println("End");
                	System.out.println(1);
                }
                else
                	System.out.println("Invalid choice");
		}
			}
	}
}
					
		
	


