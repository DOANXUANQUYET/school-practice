package k0802;

import java.util.Scanner;

public class Kadai0802 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Name -->");
		String name = scanner.next();
		Member member1 = new Member(name);

		System.out.println();
		System.out.print("Name -->");
		name = scanner.next();
		System.out.print("Point -->");
		int point = scanner.nextInt();

		Member member2 = new Member(name, point);
		System.out.println();
		
		System.out.println("No : " + member1.getNo());
		System.out.println("Name : " + member1.getName());
		System.out.print("add Point --> ");
		point = scanner.nextInt();
		member1.addPoint(point);
		System.out.println("Point : " + member1.getPoint());
		System.out.println();
		
		System.out.println("No : " + member2.getNo());
		System.out.println("Name : " + member2.getName());
		System.out.print("add Point --> ");
		point = scanner.nextInt();
		member2.addPoint(point);
		System.out.println("Point : " + member2.getPoint());
		System.out.println();

		System.out.println("No : " + member1.getNo());
		System.out.println("Name : " + member1.getName());
		System.out.print("add Point --> ");
		point = scanner.nextInt();
		int ret = member1.userPoint(point);
		if (ret != -1) {
			System.out.println("Point : " + member1.getPoint());

		} else {
			System.out.println("ERROR! Point : " + member1.getPoint());
		}
		System.out.println();

		System.out.println("No : " + member2.getNo());
		System.out.println("Name : " + member2.getName());
		System.out.print("add Point --> ");
		point = scanner.nextInt();
		ret = member2.userPoint(point);
		if(ret != -1) {
			System.out.println("Point : " + member2.getPoint());
			
		} else {
			System.out.println("ERROR! Point : " + member2.getPoint());
		}
		System.out.println();

	}

}
