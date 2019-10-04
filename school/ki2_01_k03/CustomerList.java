package ki2_01_k03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerList {

	private List<Customer> list = new ArrayList<Customer>();

	public CustomerList() {
		try (BufferedReader br = new BufferedReader(new FileReader("customer.txt"))) {
			String record;

			while ((record = br.readLine()) != null) {
				String[] items = record.split(",");
				Customer customer = new Customer(items[0], items[1]);
				list.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Customer get(String customerNo) {
		Iterator<Customer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Customer customer = iterator.next();
			if(customer.getCustomerNo().equals(customerNo)) {
				return customer;
			}
		}
		return null;
	}

}
