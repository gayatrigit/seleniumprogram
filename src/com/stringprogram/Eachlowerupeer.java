package com.stringprogram;

public class Eachlowerupeer {
	void lowerUpper(String s)
	{
		String lower="";
		for (int i=0; i<s.length(); i++)
		{
			Character c=s.charAt(i);
			
			if(i%2==0){
				
				lower=lower+Character.toLowerCase(c);
				//System.out.println(Character.toLowerCase(c));
			}
			else	
			    lower=lower+Character.toUpperCase(c);
		}
		System.out.println(lower);
	}

	public static void main(String[] args) {
		Eachlowerupeer e=new Eachlowerupeer();
		e.lowerUpper("gayatri");
	}

}
