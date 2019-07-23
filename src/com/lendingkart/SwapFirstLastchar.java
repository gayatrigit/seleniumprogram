package com.lendingkart;

public class SwapFirstLastchar {
	/* write a program to write swap First & last character in a word  
	void firstLastchar(String str)
	{
		char arr[]=str.toCharArray();
		char temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		String reversedStr=new String(arr);
		System.out.println(reversedStr);
		public static void main(String[] args) {
			SwapFirstLastchar a=new SwapFirstLastchar();
			a.firstLastchar("gayatri");
	}*/
	// write a program to write swap First & last character of each word in a sentence 
	void firstLastchar(String str)
	{
		String arr[]=str.split(" ");
		String rev=" ";
		for(int i=0; i<arr.length; i++){
			String word=arr[i];
			String revword=" ";
			for(int j=0; j<word.length()/word.length(); j++)
			{
				char a[]=word.toCharArray();
				char temp=word.charAt(0);
				a[0]=a[a.length-1];
				a[a.length-1]=temp;
				String reversedStr=new String(a);
				revword=revword+reversedStr;
			}
			rev=rev+revword;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		SwapFirstLastchar a=new SwapFirstLastchar();
		a.firstLastchar("gayatri charchi lima pupu");

	}
}
