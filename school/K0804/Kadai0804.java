package K0804;

import java.util.Scanner;

public class Kadai0804 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Current Year -->");
		int currentYear = scanner.nextInt();
		TBankAccount.setCuurentYear(currentYear);

		System.out.println();
		System.out.print("Name -->");
		String name = scanner.next();
		System.out.print("Money -->");
		int money = scanner.nextInt();
		System.out.print("Due(1/3/5) -->");
		int due = scanner.nextInt();

		TBankAccount tBankAccount1 = new TBankAccount(name, money, due);

		System.out.println();
		System.out.print("Name -->");
		name = scanner.next();
		System.out.print("Money -->");
		money = scanner.nextInt();
		System.out.print("Due(1/3/5) -->");
		due = scanner.nextInt();

		TBankAccount tBankAccount2 = new TBankAccount(name, money, due);

		System.out.println();
		System.out.print("Name -->");
		name = scanner.next();
		System.out.print("Money -->");
		money = scanner.nextInt();
		System.out.print("Due(1/3/5) -->");
		due = scanner.nextInt();

		TBankAccount tBankAccount3 = new TBankAccount(name, money, due);

		System.out.println();
		System.out.println(tBankAccount1.getNumber() + " \t " + tBankAccount1.getName() + " \t "
				+ tBankAccount1.getMoney() + " \t " + tBankAccount1.getDue());
		System.out.println(tBankAccount2.getNumber() + " \t " + tBankAccount2.getName() + " \t "
				+ tBankAccount2.getMoney() + " \t " + tBankAccount2.getDue());
		System.out.println(tBankAccount3.getNumber() + " \t " + tBankAccount3.getName() + " \t "
				+ tBankAccount3.getMoney() + " \t " + tBankAccount3.getDue());
		System.out.println();
		System.out.print("Current Year -->");
		currentYear = scanner.nextInt();
		TBankAccount.setCuurentYear(currentYear);
		scanner.nextLine();
		System.out.println();
		System.out.print("Rate -->");
		double rate = scanner.nextDouble();
		TBankAccount.setRate(rate);
		
		tBankAccount1.addInterest();
		tBankAccount2.addInterest();
		tBankAccount3.addInterest();
		
		System.out.println();
		System.out.println(tBankAccount1.getNumber() + " \t " + tBankAccount1.getName() + " \t "
				+ tBankAccount1.getMoney() + " \t " + tBankAccount1.getDue());
		System.out.println(tBankAccount2.getNumber() + " \t " + tBankAccount2.getName() + " \t "
				+ tBankAccount2.getMoney() + " \t " + tBankAccount2.getDue());
		System.out.println(tBankAccount3.getNumber() + " \t " + tBankAccount3.getName() + " \t "
				+ tBankAccount3.getMoney() + " \t " + tBankAccount3.getDue());
		System.out.println();
		
		

	}

}
