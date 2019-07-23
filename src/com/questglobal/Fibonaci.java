package com.questglobal;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxn=0;
		int prevn=0;
		int nextn=1;
		System.out.println("enter max number");
		Scanner scan=new Scanner(System.in);
		maxn=scan.nextInt();
		System.out.println("enter max number" +maxn);
		for(int i=1; i<=maxn; i++){
			System.out.println(prevn);
			int sum= prevn+nextn;
			prevn=nextn;
			nextn=sum;
		}
		
	}

}
