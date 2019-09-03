package com.programming;

public class RemveDuplicate {
	public static void remove(String s)
	{
		String s1=new String();
		for(int i=0;i<s.length(); i++)
		{
			char w=s.charAt(i);
				if(w !=' '){
					s1=s1+w;
				}
				s=s.replace(w, ' ');			
		}
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		RemveDuplicate.remove("gayatriaatrihgdsss");

	}

}
