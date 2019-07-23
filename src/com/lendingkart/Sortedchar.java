package com.lendingkart;

public class Sortedchar {

	void sortcharinstring(String s)
	{
		char a[]=s.toCharArray();
		String sort=" ";
		for(int i=0; i<a.length; i++){

			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0; k<a.length;k++){
			System.out.print(a[k]);
		
		}
		
	}

	
	public static void main(String[] args) {
		Sortedchar a=new Sortedchar();
		a.sortcharinstring("gayatri");
		

	}

}
