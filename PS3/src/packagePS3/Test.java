package packagePS3;

public class Test {

	public static void main(String[] args) {
		
		//Set up the account
		Account ben = new Account(1122, 20000);
		ben.setannualInterestRate(4.5);
		
		//Test withdraw function and Exception
		try
		{
			ben.withdraw(2500);
			System.out.println("After withdrawing $2500, balance is " + ben.getbalance());
			ben.withdraw(30000);
			System.out.println("After withdrawing $30000, balance is " + ben.getbalance());
			
		}
		catch(InsufficientFundsException a)
		{
			System.out.println("Sorry, but you do not have enough money in your account to " +
		"withdraw that amount.  You are short $" + a.getamount());
			
		}
		
		//Test balance
		ben.deposit(3000);
		System.out.println("Balance after a deposit of $3000 is $" + ben.getbalance());
		
		//Print balance, monthly interest rate, and date created
		System.out.println("Balance is $" + ben.getbalance());
		
		System.out.println("Monthly interest rate is %" + ben.getMonthlyInterestRate());
		
		System.out.println("Date account was created is " + ben.dateCreated());
		
		
		
	}

}
