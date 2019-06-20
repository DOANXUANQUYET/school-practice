package K0803;

import java.util.Scanner;

public class Kadai0803 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Name -->");
		String name = scanner.next();
		System.out.print("Money -->");
		int money = scanner.nextInt();
		FBankAccount fBankAccount1 = new FBankAccount(name, money);

		System.out.print("Name -->");
		name = scanner.next();
		System.out.print("Money -->");
		money = scanner.nextInt();
		FBankAccount fBankAccount2 = new FBankAccount(name, money);

		System.out.print("Name -->");
		name = scanner.next();
		System.out.print("Money -->");
		money = scanner.nextInt();

		FBankAccount fBankAccount3 = new FBankAccount(name, money);

		System.out.println("\n　口座一覧");
		System.out
				.println(fBankAccount1.getNumber() + "\t" + fBankAccount1.getName() + "\t" + fBankAccount1.getMoney());
		System.out
				.println(fBankAccount2.getNumber() + "\t" + fBankAccount2.getName() + "\t" + fBankAccount2.getMoney());
		System.out
				.println(fBankAccount3.getNumber() + "\t" + fBankAccount3.getName() + "\t" + fBankAccount3.getMoney());

		System.out.println("\n　入金処理");
		System.out.println("Number : " + fBankAccount1.getNumber());
		System.out.print("Deposit Money -->");
		money = scanner.nextInt();
		fBankAccount1.depositMoney(money);

		System.out.println("Number : " + fBankAccount2.getNumber());
		System.out.print("Deposit Money -->");
		money = scanner.nextInt();
		fBankAccount2.depositMoney(money);

		System.out.println("Number : " + fBankAccount3.getNumber());
		System.out.print("Deposit Money -->");
		money = scanner.nextInt();
		fBankAccount3.depositMoney(money);

		System.out.println("\n　口座一覧");
		System.out
				.println(fBankAccount1.getNumber() + "\t" + fBankAccount1.getName() + "\t" + fBankAccount1.getMoney());
		System.out
				.println(fBankAccount2.getNumber() + "\t" + fBankAccount2.getName() + "\t" + fBankAccount2.getMoney());
		System.out
				.println(fBankAccount3.getNumber() + "\t" + fBankAccount3.getName() + "\t" + fBankAccount3.getMoney());

		System.out.println("\n　出金処理");
		System.out.println("Number : " + fBankAccount1.getNumber());
		System.out.print("Payment Money -->");
		money = scanner.nextInt();
		fBankAccount1.paymentMoney(money);

		System.out.println("Number : " + fBankAccount2.getNumber());
		System.out.print("Payment Money -->");
		money = scanner.nextInt();
		fBankAccount2.paymentMoney(money);

		System.out.println("Number : " + fBankAccount3.getNumber());
		System.out.print("Payment Money -->");
		money = scanner.nextInt();
		fBankAccount3.paymentMoney(money);

		System.out.println("\n　口座一覧");
		System.out
				.println(fBankAccount1.getNumber() + "\t" + fBankAccount1.getName() + "\t" + fBankAccount1.getMoney());
		System.out
				.println(fBankAccount2.getNumber() + "\t" + fBankAccount2.getName() + "\t" + fBankAccount2.getMoney());
		System.out
				.println(fBankAccount3.getNumber() + "\t" + fBankAccount3.getName() + "\t" + fBankAccount3.getMoney());

		System.out.print("\n Rate -->");
		double rate = scanner.nextDouble();
		FBankAccount.setRate(rate);

		fBankAccount1.addInterest();
		fBankAccount2.addInterest();
		fBankAccount3.addInterest();

		System.out.println("\n　口座一覧");
		System.out
				.println(fBankAccount1.getNumber() + "\t" + fBankAccount1.getName() + "\t" + fBankAccount1.getMoney());
		System.out
				.println(fBankAccount2.getNumber() + "\t" + fBankAccount2.getName() + "\t" + fBankAccount2.getMoney());
		System.out
				.println(fBankAccount3.getNumber() + "\t" + fBankAccount3.getName() + "\t" + fBankAccount3.getMoney());

	}

}
