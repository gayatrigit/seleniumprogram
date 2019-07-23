package com.programming;

public class EachletterReverse {
	public void reverseword(String s){
		String w[]=s.split(" ");
		String revs=" ";
		String str="";
		for(int i=0; i<=w.length-1;i++)
		{
			String l=w[i];
			String rev=" ";
			for(int j=l.length()-1; j>=0; j--){
				rev=rev+l.charAt(j);
			}
			revs=revs+rev;
			str=revs.trim();
			
		}
System.out.println(str);
	}

	public static void main(String[] args) {
		EachletterReverse a=new EachletterReverse();
		a.reverseword("Hi gayatri charchi");

	}

}
