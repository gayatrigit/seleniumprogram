package com.lendingkart;

public class Removespecificindex {
	void removeshift(int arr[], int index)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(i==index)
			{
				for(int j=i; j<arr.length-1; j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Removespecificindex a=new Removespecificindex();
		int arr[]={1,2,3,4,5};
		a.removeshift(arr, 2);

	}

}
