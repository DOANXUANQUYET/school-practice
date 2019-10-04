package ki2_01_kakunin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("person.txt"))) {
			String record;

			while ((record = br.readLine()) != null) {
				String[] items = record.split(",");
				Person person = new Person(items[0], items[1]);
				list.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!list.isEmpty()) {
			System.out.println("インデックスを使用してlistを操作");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + " : " + list.get(i).toString());
			}

			System.out.println();
			System.out.print("Search Person Name -->");
			String name = sc.next();
			System.out.print("Search Person Type -->");
			String type = sc.next();
			
			Person p = new Person(name, type);
			int idx = list.indexOf(p);
			if(idx >= 0) {
				System.out.println("Search Success Index : " + idx);
			}else {
				System.out.println("Person Not Found");
			}
			System.out.println();
			System.out.println("Iterator を使用してlistを操作");
			Iterator<Person> iterator = list.iterator();
			while(iterator.hasNext()) {
				Person person = iterator.next();
				System.out.println(person.toString());
			}
		}
	}

}
