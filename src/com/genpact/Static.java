package com.genpact;

public class Static {
	static
	{
		System.out.println("one");
	}
	Static()
	{
	System.out.println("two");
	}
	

	public static void main(String[] args) {
		System.out.println("three");
		Static s1=new Static();
		System.out.println("four");
		{
			System.out.println("five");
		}

	}

}
