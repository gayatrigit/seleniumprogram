package com.amex;

public class Riskcodenotintry {

	public static void main(String[] args) {
		int a=0;
		int b=2;
		int c=b/a;
		try
		{
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("finally block");
		}
		
	}

}
