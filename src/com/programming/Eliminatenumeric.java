package com.programming;

public class Eliminatenumeric {
	StringBuffer alpha=new StringBuffer();
	StringBuffer num=new StringBuffer();
	StringBuffer spechar=new StringBuffer();
	void eliminate(String s)
	{
		for(int i=0; i<s.length(); i++ )
		{
		if(Character.isDigit(s.charAt(i)))
			num.append(s.charAt(i));
		else if(Character.isAlphabetic(s.charAt(i)))
			alpha.append(s.charAt(i));
		else
			spechar.append(s.charAt(i));
		}
		StringBuffer s1=alpha.append(spechar);
		StringBuffer s2=s1.append(num);
		System.out.println(s2);
		//StringBuffer s3=new StringBuffer(s2);
		String str=s2.toString();
	    String s3=str.replaceAll("\\d", " ");
	    System.out.println(s3.trim());
	}

	public static void main(String[] args) {
		Eliminatenumeric a=new Eliminatenumeric();
		a.eliminate("sub53od73th");

	}

}
