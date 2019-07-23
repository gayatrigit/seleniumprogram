package com.programming;

public class Duplicatewordfrequency {
	void duplicatefrequency(String s){
		String[] word=s.split(" ");
		int counto=0;
		String tempElement=" ";
		for (int i=0; i<word.length; i++){
			int count=0;
			String temp=word[i];
			for(int j=0; j<word.length; j++)
			{
				//System.out.println(word[2]);
				if(word[j].equalsIgnoreCase(temp))				
					count++;				
				
			}
			if(count > 1)  
                System.out.println(word[i]); 
		}
	} 

	public static void main(String[] args) {
		
		Duplicatewordfrequency a=new Duplicatewordfrequency();
		a.duplicatefrequency("gayatri gayatri gayatri Tanvi charchi charchi");

	}

}
