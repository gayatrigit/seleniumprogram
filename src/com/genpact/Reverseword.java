package com.genpact;

public class Reverseword {
	void wordreverse(String str)
	{
		String Words[]=str.split(" ");
		String revstr=" ";
		//System.out.println(Words.length);
		for(int i=Words.length-1; i>=0; i--)
		{
			String letter=Words[i];
			String samechar=" ";
			for(int j=0; j<=letter.length()-1; j++){
				samechar=samechar+letter.charAt(j);
				//System.out.println(samechar);
			}
			revstr=revstr+samechar;

		}
		System.out.println(revstr);
	}

	public static void main(String[] args) {
		Reverseword w=new Reverseword();
		w.wordreverse("Welcome to nuvizz");

	}

}
