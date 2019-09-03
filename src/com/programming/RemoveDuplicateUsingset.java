package com.programming;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateUsingset {
	static void duplicate(String s)
	{
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		//char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character ch:hs)
		{
			System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		RemoveDuplicateUsingset.duplicate("gayatri");

	}

}
