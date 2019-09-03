package com.lendingkart;

public class Searchastring {
	
	int searching(String s, String search){
		//System.out.println(s.lastIndexOf('n',150)); // nuvizz employee Gayatri
		
		int a=s.length();
		int b=search.length();
		for(int i=0; i<a; i++){
			int j;
			for(j=0; j<b; j++){
				if(s.charAt(i+j)!=search.charAt(j))
					break;
				
			}
			if(j==b)
				return i;
		}
		return -1;
			
	}

	public static void main(String[] args) {
		Searchastring a=new Searchastring();
		int res=a.searching("nuvizz employee Gayatri", "Gayatri");
		if (res==-1)
			System.out.println("not a substring");
		else
			System.out.println(res);
		}
	}
