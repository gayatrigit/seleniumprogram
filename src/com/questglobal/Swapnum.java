package com.questglobal;

import java.util.Scanner;

public class Swapnum {

	public static void main(String[] args) {
		System.out.println("Enter first number");
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		System.out.println("first number " +a+ "  second number  " +b);
		a=a+b;
		b=a-b;
		a=a-b;
 System.out.println("first number " +a+ "  second number  "+b);
	}

}
