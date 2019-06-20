package k0801;

import java.util.Scanner;

public class Kadai0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Id -->");
		String id = scanner.next();
		System.out.print("Name -->");
		String name = scanner.next();
		
		Engineer engineer1 = new Engineer(id, name);
		System.out.println();
		
		System.out.print("Id -->");
		 id = scanner.next();
		System.out.print("Name -->");
		 name = scanner.next();
		 System.out.print("Project Name -->");
		 String projectName = scanner.next();
		 
		 Engineer engineer2 = new Engineer(id,name, projectName);
		 
		 System.out.println();
		 System.out.println("Id : " + engineer1.getId());
		 System.out.println("Name : " + engineer1.getName());
		 System.out.println("Project Name : " + engineer1.getProjectName());
		 System.out.println();
		 System.out.println("Id : " + engineer2.getId());
		 System.out.println("Name : " + engineer2.getName());
		 System.out.println("Project Name : " + engineer2.getProjectName());
		 System.out.println();
		 
		 
		 System.out.print(engineer1.getName() + "'s New Project Name -->");
		 projectName = scanner.next();
		 engineer1.setProjectName(projectName);
		 System.out.print(engineer2.getName() + "'s New Project Name -->");
		 projectName = scanner.next();
		 engineer2.setProjectName(projectName);
		 
		 System.out.println();
		 System.out.println("Id : " + engineer1.getId());
		 System.out.println("Name : " + engineer1.getName());
		 System.out.println("Project Name : " + engineer1.getProjectName());
		 System.out.println();
		 System.out.println("Id : " + engineer2.getId());
		 System.out.println("Name : " + engineer2.getName());
		 System.out.println("Project Name : " + engineer2.getProjectName());
		 System.out.println();
		 
		 
		
		

	}

}
