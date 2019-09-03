package com.questglobal;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxn=0;
		int a=0;
		int b=1;
		System.out.println("enter max number");
		Scanner scan=new Scanner(System.in);
		maxn=scan.nextInt();
		System.out.println("enter max number" +maxn);
		for(int i=1; i<=maxn; i++){
			System.out.println(a);
			int c= a+b;
			a=b;
			b=c;
		}
		
	}

}
