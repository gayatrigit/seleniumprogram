package com.programming;

public class SeparateZero {

	public static void main(String[] args) {

		int arr[]={14,0,3,0,9,10};
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]!=0)
			{
				
				arr[count]=arr[i];
				count++;
				
			}
		}
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
		}


	}
}
