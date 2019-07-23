package com.programming;

public class AscendingorderinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={70,50,30,60};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				// Ascending order if (a[i]>a[j])
				// desceding order if (a[i]<a[j])
				if (a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
			} 
		
		System.out.println("Highest number" +a[0]);
		System.out.println("secnd highest number" +a[1]);
	}

}
