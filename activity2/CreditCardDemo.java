package activity2;

public class CreditCardDemo {
	public static void main(String[]args) {
	CreditCard[] wallet = new CreditCard[3];
	wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
	wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
	wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);
	for(CreditCard card : wallet) {
		CreditCard.printSummary (card);
		System.out.println();
	}
	for (int val = 1; val <= 16; val++) {
		wallet[0].charge(3*val);
		wallet[1].charge(2*val);
		wallet[2].charge(val);
	}
	for (CreditCard card: wallet) {
		System.out.println("Charging..." + card.getAccount() + " : " +
		card.getBalance());
	}
	System.out.println();
	System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
	System.out.println();
	for (CreditCard card : wallet) {
		CreditCard.printSummary(card);
		while (card.getBalance() > 200.0) {
			card.makePayment(200);
		System.out.println();
		System.out.println("Make a payment of 200");
		System.out.println("New balance = " + card.getBalance());
		}
		System.out.println();
	}
	}
}
