package com.programming;

import java.util.Arrays;

public class RemoveDuplicateInSameArray {

	static void sortDuplicate(char[] a)
	{
		
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j+1;i++)
		{
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		char arr[]={'a','n','c','n','l','n'};
		RemoveDuplicateSortUsingTempArray.sortDuplicate(arr);

	}

}
