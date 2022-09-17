package bank;

public class Account {
	int accountNumber=123456;
	double amount=4567;
	
	double withdraw(double amount) 
	{
		if (this.amount>amount)
		{
			return this.amount-amount;
		}
		else {
			System.out.println("insufficent amount");
	
			return this.amount;
		}
		
}
	double balanceCheck()
	{
		return amount;
	}
 double deposit(double amount) 
 {
	 return this.amount+amount;
	 
	  }
 



}
