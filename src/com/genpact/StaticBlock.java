package com.genpact;

public class StaticBlock {
	static
	{
		System.out.println("one");
	}
	StaticBlock()
	{
	System.out.println("two");
	}
	

	public static void main(String[] args) {
		System.out.println("three");
		StaticBlock s1=new StaticBlock();
		System.out.println("four");
		{
			System.out.println("five");
		}

	}

}
