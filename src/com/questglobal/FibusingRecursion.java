package com.questglobal;

public class FibusingRecursion {
	int fib(int n){
		if(n == 1 || n == 2)
			return 1;
		else
		return (fib(n-1)+fib(n-2));
					
	}

	public static void main(String[] args) {
		FibusingRecursion fib= new FibusingRecursion();
		System.out.println(fib.fib(10));
	}

}
