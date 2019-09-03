package com.programming;

public class Mostfrequency {

	public static void main(String[] args) {
		int a[]={4,5,8,7,4,7,6,7};
		int element=0;
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			int tempelement=a[i];
			int tempcount=0;
			for(int j=0; j<a.length; j++)
			{
			
				if(a[j] == tempelement)
					tempcount ++;
			}
				if(tempcount>count)
				{
					element=tempelement;
					count=tempcount;
					
				}
			
			 
		}
		System.out.println("most frequency number "  +element+  " freqency is " +count);

	}

}
