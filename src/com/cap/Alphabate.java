package com.cap;

public class Alphabate {
	StringBuffer num=new StringBuffer(),alpha=new StringBuffer(),
			special=new StringBuffer();
	void append(String s){
		for(int i=0; i<s.length(); i++){
			if(Character.isDigit(s.charAt(i)))
				num.append(s.charAt(i));
			else if(Character.isAlphabetic(s.charAt(i)))
				alpha.append(s.charAt(i));
			else
				special.append(s.charAt(i));
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(special);
		StringBuffer s1=num.append(alpha);
		StringBuffer s3=s1.append(special);
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Alphabate a=new Alphabate();
		a.append("gayatri@1/2?3");

	}

}
