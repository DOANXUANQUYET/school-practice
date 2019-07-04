package k103;

import java.util.Scanner;

public class kadai103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Select(FIFO  or  LIFO) -->");
		String mode = scanner.next();
		Store store = null;
		
		switch (mode) {
		case "FIFO":
			store = new FifoStore();
			break;
		case "LIFO":
			store = new LifoStore();
			break;
		default:
			System.out.println("Erro!");
			break;
		}
		
		System.out.print("Select(Put  or  Get or  End) -->");
		mode = scanner.next();
		
		while(!mode.equals("End")) {
			
			if(mode.equals("Put")){
				System.out.print("No -->");
				int no = scanner.nextInt();
				System.out.print("Name -->");
				String name = scanner.next();
				User user = new User(no, name);
				
				store.put(user);
			}
			else if(mode.equals("Get")) {
				User user = (User)store.get();
				if(user != null) {
					System.out.println(user.getNo() + "\t" + user.getName());
				}
				else {
					System.out.println("Not Exist");
				}
			}
			else {
				System.out.println("Error!");
			}
			
			System.out.println("Store Size ---> " + store.size());
			
			System.out.print("Select(Put  or  Get or  End) -->");
			mode = scanner.next();

		}
	}

}
