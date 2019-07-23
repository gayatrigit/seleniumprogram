package com.star;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=4; i++)
		{
			// clumn shuld be decreased 1
			for(int j=3; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
