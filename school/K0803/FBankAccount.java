package K0803;

public class FBankAccount extends BankBase {
	

	static private double rate;
	static private int counter = 1001;
	
	
	public FBankAccount(String name, int money) {
		super("F" + FBankAccount.counter, name, money);
		FBankAccount.counter += 10;
	}

	public void addInterest() {
		int interest = (int)(this.getMoney() * (rate / 100));
		this.depositMoney(interest);
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		FBankAccount.rate = rate;
	}
	
	




}
