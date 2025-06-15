package org.advance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex10_Collection_List {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("Manoj");
		li.add(1);
		li.add(1.0f);
		li.add("Manoj");
		System.out.println(li);
		//get size of arrayList
		System.out.println("size of aarayList= "+ li.size());
		//remove arrayList
		li.remove(3);
		System.out.println(li);
		//insert element in arrayList
		li.add(2, "biki");
		System.out.println(li);
		//modify any element in arrayList
		li.set(2, "vivki");
		System.out.println(li);
		//access specify element from arraylist
		System.out.println(li.get(2));
		
		//print all data using  normal for loop
		for(int i=0; i<li.size(); i++) {
			System.out.print(" "+li.get(i));
		}
		//using for each loop
		System.out.println();
		for(Object e:li) {
			System.out.print(" "+e);
		}
		System.out.println();
		//By using iterator
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		System.out.println();
		//Now we have to remove manoj and 1.0
		List li2=new ArrayList();
		li2.add("Manoj");
		li2.add(1.0f);
		//li.remove(li2);
		li.removeAll(li2);
		System.out.println(li);
		
		//now remove all elemwnts
		System.out.println(li.removeAll(li));
		System.out.println(li);

	}

}
