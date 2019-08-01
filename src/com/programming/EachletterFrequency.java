package com.programming;

public class EachletterFrequency {

	public static void main(String[] args) {
		String s="hello";
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0; j<arr.length;j++)	
			{
				if(j<i && arr[i]==arr[j])
					break;
				if(arr[i]==arr[j])
					count++;
				if(j==arr.length-1)
					System.out.println(arr[i]+"----"+count);

			}
			
		}

		
	}

}
