package com.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordFrequencyMap2 {
	static void duplicate(String s)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String[] word=s.split(" ");
		for(String temps:word)
		{
			if(hm.get(temps)!=null)
				hm.put(temps, hm.get(temps)+1);
			else
				hm.put(temps, 1);
		}
			Set<Entry<String,Integer>> st=hm.entrySet();
			for(Entry<String,Integer> entry:st)
			{
				if(entry.getValue()>1)
					System.out.println("Element :"+entry.getKey()+" frequency :"+entry.getValue());
			}
				/*while(itr.hasNext())
			{
				<Entry<String,Integer>> temp=itr.next();
				if(hm.get(temps)>1)
					System.out.println("Element"+temps+"frequency"+hm.get(temps));
			}*/
			
			
		}
	static void duplicatechar(String str)
	{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0; i<str.length();i++)
		{
			Character c=str.charAt(i);
			if (hm.get(c)!=null)
				hm.put(c, hm.get(c)+1);
			else
				hm.put(c, 1);
		}
		Set<Entry<Character,Integer>>st=hm.entrySet();
		for(Entry<Character,Integer> entry:st)
		{
			if (entry.getValue()>1)
				System.out.println("Element :"+entry.getKey()+" frequency :"+entry.getValue());
		}
	}

		public static void main(String[] args) {
			//DuplicateWordFrequencyMap2.duplicate("I am learning java am java java");
			DuplicateWordFrequencyMap2.duplicatechar("javasoftwaressolutions");

		}

	}
