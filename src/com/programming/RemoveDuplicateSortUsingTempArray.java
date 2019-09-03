package com.programming;

import java.util.Arrays;

public class RemoveDuplicateSortUsingTempArray {
	static void sortDuplicate(char[] a)
	{
		char[] temp=new char[a.length-1];
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]);
		}
	}

	public static void main(String[] args) {
		char arr[]={'a','n','c','n','l','n'};
		RemoveDuplicateSortUsingTempArray.sortDuplicate(arr);

	}

}
