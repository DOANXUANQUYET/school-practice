package ki2_01_k01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Kadai0101 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		System.out.print("String --> ");
		String input = sc.next();
		list.add(input);
		System.out.print("Continue ? (Yes or No) --> ");
		String run = sc.next();
		while(run.equals("Yes")) {
			System.out.print("String --> ");
			input = sc.next();
			list.add(input);
			System.out.print("Continue ? (Yes or No) --> ");
			run = sc.next();
		}
		
		System.out.println();
		System.out.print("File Name -->");
		String fileName = sc.next();
		
		try(BufferedWriter wr = new BufferedWriter(new FileWriter(fileName))) {
			Iterator<String> iterator = list.iterator();
			while(iterator.hasNext()) {
				String data = iterator.next();
				wr.write(data);
				wr.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
