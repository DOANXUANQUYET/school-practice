package ki2_01_k02;

import java.util.Scanner;

public class Kadai0102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserManager userManager = new UserManager();
		
		System.out.println("1 : Add User");
		System.out.println("2 : Remove User");
		System.out.println("3 : Print Users");
		System.out.println("4 : Save users");
		System.out.println("9 : End");
		
		System.out.println();
		System.out.print("Select -->");
		int mode = sc.nextInt();
		while(mode != 9) {	
			switch (mode) {
			case 1:
				System.out.print("User name -=>");
				String userName = sc.next();
				userManager.add(new User(userName));
				break;
			case 2:
				System.out.print("User No -=>");
				int userNo = sc.nextInt();
				if(userManager.remove(userNo)) {
					System.out.println("User No." + userNo + "  Remove");
				}else {
					System.out.println("User No." + userNo + "  Not Found");
				}
				break;
			case 3:
				for(User user : userManager.getUser()) {
					System.out.println(user.getNo() + "\t" + user.getName());
				}
				break;
			case 4:
				System.out.print("File Name -->");
				String fileName = sc.next();
				System.out.println("Save Count : " + userManager.save(fileName));
				break;
			default:
				System.out.println("input Error");
				break;
			}
			System.out.print("Select -->");
			mode = sc.nextInt();
		}
	}
}
