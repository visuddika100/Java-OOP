public class BankAccount{
	int accountNumber;
	int balance;
	
	
	BankAccount(int accountnumber,int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	public void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println("The Account "+ accountNumber +" Deposit" + balance );		
	}

	public static void main(String[] arg)
	{
		BankAccount A1 = new BankAccount(2997835,10000);
		
		A1.deposit(15000);
	}
}