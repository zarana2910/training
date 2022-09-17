package bank;

import java.util.Scanner;

public class User extends Account {

	public static void main(String[] args) {
		User user=new User();
		int pin=1234;
		System.out.println("plz enter PIN:");
		Scanner scanner=new Scanner(System.in);
        int pass=scanner.nextInt();
        
        if(pin==pass)
        {
		System.out.println("plz select one option from below");
		System.out.println("1.withdraw 2.balcheck 3.deposit");
		int option=scanner.nextInt();
		
		
		switch (option) {
		case 1:
			System.out.println("plz enter withdraw ammount");
			double withdrawAmmount=scanner.nextDouble();
			System.out.println("remaining bal is "+user.withdraw(withdrawAmmount));
			
			break;
		case 2:
			System.out.println("your bal is "+user.balanceCheck());
			break;
		case 3:
			System.out.println("plz enter deposit ammount");
			double depositammount=scanner.nextDouble();
			System.out.println("your bal is "+user.deposit(depositammount));
			
			
			break;
		default:
			System.out.println("plz select valid option");
		
			break;
		}
		}

	else
	{
		
		System.out.println("PIN is invalid");
		
		
	}
	} 
	}


