package activity2;

public class CreditCard {
	//Instances Variables
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;	
	//Constructors for wallet[2]
	public CreditCard(String cust, String bk, String acnt, int lim, double
	initialBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}
	// Constructor for wallet[0] && wallet[1]
	public CreditCard (String cust, String bk, String acnt, int lim){
		this(cust, bk, acnt, lim, 0.0);
	}
	//Accessor methods
	public String getCustomer(){return customer;}
	public String getBank() {return bank;}
	public String getAccount() {return account;}
	public int getLimit() {return limit;}
	public double getBalance() {return balance;}
	//Update Methods
	public boolean charge(double price) {
	if(price + balance > limit)
		return false;
	balance += price;
	return true;
	}
	public void makePayment(double amount) {
	balance -= amount;
	}
	//Utility method to print a card's information
	public static void printSummary(CreditCard card) { // Passed objects as arguments, nice
	System.out.println("Customer = " + card.customer);
	System.out.println("Bank = " + card.bank);
	System.out.println("Account = " + card.account);
	System.out.printf("Balance = %.2f" ,card.balance);
	System.out.println();
	System.out.println("Limit = " + card.limit);
	
	}
}

