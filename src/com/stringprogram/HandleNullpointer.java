package com.stringprogram;

public class HandleNullpointer {

	public static void main(String[] args) {
		String s=null;
		try
		{
			if (s.equals("abc"))
				System.out.println("null pointer exception");
			else
				System.out.println("not same");
		}
		catch(NullPointerException e)
		{
		System.out.println("catch null pointer exception");
		}

	}

}
