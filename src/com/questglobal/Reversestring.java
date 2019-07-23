package com.questglobal;

import java.util.Scanner;

public class Reversestring {
	void reverse(String s){
		String reverse="";
		int n=s.length();
		for(int i=n-1; i>=0; i--)
			reverse=reverse+s.charAt(i);
			System.out.println(reverse);
		
	}

	public static void main(String[] args) {
		Reversestring re=new Reversestring();
		re.reverse("Gayatri");
		
		
	}

}
