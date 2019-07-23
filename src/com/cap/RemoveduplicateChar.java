package com.cap;

public class RemoveduplicateChar {
	
	void replacespceduplicatechar(String str){
		//String output=new String();
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					String s=str.replace(str.charAt(j), ' ');
					System.out.println(s);
					String rev=" ";
					for(int k=s.length()-1; k>=0; k--){
						rev=rev+s.charAt(k);
					}
					System.out.println(rev);
					}
					
				}
				//System.out.println(output);
			}
			//System.out.println(output);
		}
			

	public static void main(String[] args) {
		RemoveduplicateChar r=new RemoveduplicateChar();
		r.replacespceduplicatechar("Gayatri");

	}

}
