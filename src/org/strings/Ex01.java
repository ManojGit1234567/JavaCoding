package org.strings;

public class Ex01 {

	public static void main(String[] args) {
		String a="Manoj Pandit";
		String[] s=a.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		String conc=s[1].concat(" "+s[0]);
		System.out.println(conc);
		
		String rev=conc.replace("Pandit", "Manish");
		System.out.println(rev);
		
		String h="cfGVHBkj ghj";
		System.out.println(h.contains("c"));
		
	   System.out.println(h.charAt(5));
	   System.out.println(h.substring(1));
	   System.out.println(h.substring(1, 3));
	   System.out.println(h.concat(a));
	   System.out.println(h.indexOf("f"));
	   System.out.println(h.trim());
	   System.out.println(h.replace("cfg", "CFG"));
	   System.out.println(h.toLowerCase());
	   System.out.println(h.toUpperCase());
	   System.out.println(h.endsWith("gh"));
	   System.out.println(h.compareTo(a));
	   
	   int ab=1011;
	   String ss="hbhb hjhb";
	   char ch[]=ss.toCharArray();
	   int size=ch.length;
	   for(int i=size-1; i>=0; i--) {
		   System.out.print(ch[i]);
	   }

	}

}
