package org.advance;

import java.util.HashMap;
import java.util.Map;

public class Ex12_Collection_Map {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1, "Manoj");
		m.put(2, "Vijay");
		m.put(3, "Mayur");
		m.put(4, "Rahul");
		m.put(1, "Dinesh");
		System.out.println(m);
		System.out.println("Size of Map= "+m.size());
		
		//remove one pair
		m.remove(1);
		System.out.println(m);
		//access value based on key
		System.out.println(m.get(2));
		//get all keys from hashmap
		System.out.println(m.keySet());
		//get all values from hashmap
		System.out.println(m.values());
		//get keys along with values
		System.out.println(m.entrySet());
		
		//read data using loop
		for(Object i: m.entrySet()) {
			System.out.println(i);
		}
	}

}
