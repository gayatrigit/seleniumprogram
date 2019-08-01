package com.genpact;

public class Primepallendrom {

	public static void main(String[] args) {

		for(int j=2; j<=1000; j++) {
			
			int count =0;
			for(int i=2; i<=j/2; i++) {
				if(j%i==0 && j !=i) {
					count++;
				}
			}
			
			if(count>1) {
				//System.out.println("number is  prime " +j);
			
				int rev=0;
				int m=j;

				while(m!=0)	{
					int rem=m%10;
					rev=rev*10+rem;
					m=m/10;
					
				}
				//System.out.println("reverse number "+ rev);
				
				if(j==rev){
				System.out.println("number is pallendrom " +j);
				}
			}

		}


	}

}
