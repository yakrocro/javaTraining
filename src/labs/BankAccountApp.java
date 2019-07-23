package labs;

public class BankAccountApp {
	
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123456789", 1200);
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		acc1.setName("Jim");
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest {
	// Properties of a bank account
	// Multi cursor in java => cmd + alt + a 
	private static int iD = 1000;
	private String accountNumber ;
	private static final String routingNumber = "005400657";
	private String name ;
	private String ssn ;
	private double balance ;
	
	public BankAccount(String ssn, double initDeposit) {
		balance = initDeposit ;
		System.out.println("New account created");
		this.ssn = ssn ;
		iD++;
		setAccountNumber();
		showBalance();
		
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + random + ssn.substring(0, 2);
		System.out.println("Your Account number is : " + accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return this.name ;
	}
	
	public void payBill(double amount) {
		System.out.println(" - Paying bill : " + amount);
		balance = balance - amount ;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println(" + Making deposit : " + amount);
		balance = balance + amount ;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance : " + balance);
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1 + rate/100)  ;
		showBalance();
		
	}
	
	@Override
	public String toString() {
		return "[ Name : " + name + "\n Account number : " + accountNumber + 
				"\n Routing number : " + routingNumber + 
				"\n Balance : " + balance + " ]";
	}
	
}