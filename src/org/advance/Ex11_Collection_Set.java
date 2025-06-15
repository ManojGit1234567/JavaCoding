package org.advance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_Collection_Set {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(1);
		System.out.println("Size of hashSet= "+s.size());
		System.out.println(s);
		//remove any value
		s.remove(1);
		System.out.println(s);
		//check hashset is empty or not
		System.out.println(s.isEmpty());
		
		//we can't get specify value of hashset as it do not have indexing
		ArrayList<Integer> al=new ArrayList<Integer>(s);
		for(int i=0; i<al.size(); i++) {
			if(i==0) {
				System.out.print(al.get(i));
			}
			System.out.print(" "+al.get(i));
		}
		System.out.println();
		for(Integer t:al) {
			System.out.print(" "+t);
		}
		System.out.println();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}

	}

}
