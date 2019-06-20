package K0804;

import K0803.BankBase;

public class TBankAccount extends BankBase {

	private int due;
	private int year;

	static private int cuurentYear;
	static private double rate;
	static private int counter = 1001;

	public TBankAccount(String name, int money, int due) {
		super("T" + TBankAccount.counter, name, money);
		this.due = due;
		this.year = TBankAccount.cuurentYear;
		TBankAccount.counter += 10;
	}

	public int getDue() {
		return due;
	}

	public int getYear() {
		return year;
	}

	public static int getCuurentYear() {
		return cuurentYear;
	}

	public static double getRate() {
		return rate;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCuurentYear(int cuurentYear) {
		TBankAccount.cuurentYear = cuurentYear;
	}

	public static void setRate(double rate) {
		TBankAccount.rate = rate;
	}

	public void addInterest() {
		if (TBankAccount.cuurentYear - this.year >= this.due) {
			int money = (int) (this.getMoney() * (Math.pow((1 + TBankAccount.getRate() / 100), this.due) - 1));
			this.depositMoney(money);
		}
	}

}
