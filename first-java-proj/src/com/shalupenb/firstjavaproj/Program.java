package com.shalupenb.firstjavaproj;

import com.shalupenb.firstjavaproj.model.Cat;

public class Program {

	public static void main(String[] args) {
		//System.out.println("enter smth:");
		//while (true) {
		//	try (var scan = new Scanner(System.in)) {
		//		int number = scan.nextInt();
		//		System.out.println("u entered: " + number);
		//	} catch (Exception ex) {
		//		System.out.println("InputMismatchException");
		//		continue;
		//	}
		//	break;
		//}
		Cat c = new Cat();
		c.setName("kitten");
		System.out.println(c.getName());
	}

}
