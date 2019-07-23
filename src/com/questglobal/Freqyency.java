package com.questglobal;

public class Freqyency {

	public static void main(String[] args) {
		int a[]={4,5,8,7,4,7,6,7};
		int element=0;
		int count=0;

		for(int i=0; i<a.length; i++)
		{
			int tempelement,temp=0;
			tempelement=a[i];
			for(int j=0;j<a.length;j++)
			{

				if(tempelement==a[j])
				{
					temp++;

				}
				if(temp>count)
				{
					element=tempelement;
					count=temp;

				}
					

			}
			System.out.println(element);
			System.out.println(count);
			
		}
		System.out.println(element);
		System.out.println(count);
	}

}
