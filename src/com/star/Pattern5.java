package com.star;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=4; i++)
		{
			// fr space
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			// fr *
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=4; i++)
		{
			// fr space
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			// fr *
			for(int k=3; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
