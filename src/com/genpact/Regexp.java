package com.genpact;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

	public static void main(String[] args) {
		String s="TestcasePassed100TestcaseFailed25Testcaseskipped50";
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher(s);
		int start=0;
		int sum=0;
		while(m.find(start))
		{
			String n=m.group();
			sum=sum+Integer.parseInt(n);
			start=m.end();
		
		}
		System.out.println(sum);
	}
	

}
