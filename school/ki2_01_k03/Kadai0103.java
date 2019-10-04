package ki2_01_k03;

import java.io.BufferedReader;
import java.io.FileReader;

public class Kadai0103 {

	public static void main(String[] args) {
		GoodsList goodsList = new GoodsList();
		CustomerList customerList = new CustomerList();

		try (BufferedReader br = new BufferedReader(new FileReader("konyu.txt"))) {
			String record;
			String customerNo = "";
			int total = 0;
			boolean first = true;

			while ((record = br.readLine()) != null) {
				String[] items = record.split(",");
				int amount = Integer.valueOf(items[2]);
				if (!items[0].equals(customerNo)) {
					if (!first) {
						System.out.println("\t\t\t\tTotal : " + total);
					}
					total = 0;
					customerNo = items[0];
					Customer customer = customerList.get(customerNo);
					System.out.println(customer.getCustomerNo() + " : " + customer.getCustomerName());
					first = false;
				}
				Goods good = goodsList.get(items[1]);
				total += good.getPrice() * amount;
				System.out.println("\t" + good.getGoodsCode() + "    " + good.getGoodsName() + "     " + good.getPrice()
						+ " * " + items[2] + " = " + good.getPrice() * amount);
			}
			System.out.println("\t\t\t\tTotal : " + total);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
