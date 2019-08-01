package com.programming;

import java.util.HashMap;

public class EachwordFrequencyMap {
	void duplicatefrequency(String s){
		String[] word=s.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String temps:word)
		{
			if(hm.get(temps)!=null)
				hm.put(temps, hm.get(temps)+1);
			else
			hm.put(temps, 1);
			
		}
		System.out.println(hm);
	} 

	public static void main(String[] args) {
		
		EachwordFrequencyMap a=new EachwordFrequencyMap();
		a.duplicatefrequency("gayatri gayatri gayatri Tanvi charchi charchi");

	}

}
