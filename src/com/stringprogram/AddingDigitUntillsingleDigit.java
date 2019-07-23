package com.stringprogram;

public class AddingDigitUntillsingleDigit {
	long addDigit(long n)
	{
		long sum=0;
		while(n>0 || sum >9){
			if(n==0){
				n=sum;
			    sum=0;
			}
			else
			{
				long a=n%10;
				sum=sum+a;
				n=n/10;
			}
		}
		return sum;
		
	
	}

	public static void main(String[] args) {
		AddingDigitUntillsingleDigit add=new AddingDigitUntillsingleDigit();
		long sum1=add.addDigit(9999);
		System.out.println(sum1);
  
	}

}
