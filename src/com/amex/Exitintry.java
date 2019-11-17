package com.amex;

public class Exitintry {

	public static void main(String[] args) {
		
		try
		{
			int a=0;
			int b=2;
			int c=b/a;
			System.exit(1);
		}
		catch(Exception e)
		{
			System.out.println("jsva");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
