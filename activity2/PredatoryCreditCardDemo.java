package activity2;

public class PredatoryCreditCardDemo extends PredatoryCreditCard {

	
	public PredatoryCreditCardDemo(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
		super(cust, bk, acnt, lim, initialBal, rate);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PredatoryCreditCard wallet = new PredatoryCreditCard("John Bowman", "Californian Savings", "5391 0375 9387 5309", 2500,300.00, 1.2);
		CreditCard.printSummary(wallet);
		System.out.println("Annual Percentage Rate = 1.2");
		System.out.println("\nProcess Month...\n");
		
		wallet.processMonth();
		CreditCard.printSummary(wallet);
		System.out.println("Annual Percentage Rate = 1.2");
		System.out.println("\nCharge...5\n");
		
		wallet.charge(wallet.getLimit());
		CreditCard.printSummary(wallet);	
		System.out.println("Annual Percentage Rate = 1.2");
	}

}
