package activity2;

public class PredatoryCreditCard extends CreditCard {
	
	//Additional instance variable
	private double apr;		//annual percentage rate
	//Constructor for this class
	public PredatoryCreditCard (String cust, String bk, String acnt, int lim, double initialBal, double rate) {
		super(cust, bk, acnt, lim, initialBal);	//initialize superclass attributes
		apr = rate;	
	}

		//A new method for assessing monthly interest charges
	public void processMonth() {
		if (balance > 0) {
			double monthlyFactor= Math.pow(1 + apr, 1.0/12);
			balance *= monthlyFactor;
		}
	}

	//Overriding the charge method defined in the superclass
	public boolean charge(double price) {
		boolean isSuccess = super.charge(price);
		if (!isSuccess)
			balance += 5;
		return isSuccess;
	}
}
