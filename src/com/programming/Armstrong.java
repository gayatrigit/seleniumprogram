package com.programming;

public class Armstrong {

	public static void main(String[] args) {

		for(int i=1; i<=1000; i++){
			int n=i;
			int length=0;
			while(n!=0){
				n=n/10;
				length=length+1;
			}
			//System.out.println(length);
			int j=i;
			int rem=0;
			int sum=0;

			while(j!=0){
				rem=j%10;
				sum=sum+power(rem, length);
				j=j/10;
			}
			if (i==sum)
				System.out.println("number is armostrong " +i);
			//else
				//System.out.println("number is not armostrong " +i);

		}


	}
	static int power(int x, int y){
		int c,p=1;
		for(c=1; c<=y; c++){
			p=p*x;

		}
		return p;

	}
}


