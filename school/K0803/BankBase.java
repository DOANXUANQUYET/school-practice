package K0803;

public class BankBase {
	private String number;
	private String name;
	private int money;

	public BankBase(String number, String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}
	

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public void depositMoney(int money) {
		this.money += money;
	}

	public void paymentMoney(int money) {
		if (this.money >= money) {
			this.money -= money;
		} else {
			System.out.println("残高不足です。");
		}
	}
}
