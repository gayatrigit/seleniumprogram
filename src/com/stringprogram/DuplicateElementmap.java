package com.stringprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementmap {
	void duplicateElement(String s){
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		char arr[]=s.toCharArray();
		for(char c:arr){
			if(!m.containsKey(c))
				m.put(c, 1);
			else
				m.put(c, m.get(c)+1);
			
		}
		Set<Map.Entry<Character,Integer>> e=m.entrySet();
		for(Map.Entry<Character, Integer> entry: e){
			if(entry.getValue()>1)
				System.out.println("print the key: "+entry.getKey()+ " Print the value: "+entry.getValue());
		}
		
		
	}


	public static void main(String[] args) {
		DuplicateElementmap d=new DuplicateElementmap();
		d.duplicateElement("gayatri charchi");
	}
}
