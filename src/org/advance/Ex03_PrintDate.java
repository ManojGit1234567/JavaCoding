package org.advance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03_PrintDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		SimpleDateFormat a=new SimpleDateFormat();
		System.out.println(a.format(dt));
		
		//Date dt=new Date();
		SimpleDateFormat b=new SimpleDateFormat("dd/MMM/yyyy hh/mm/ss");
		System.out.println(b.format(dt));
		String d=b.format(dt);
		d=d.trim();
		d=d.replace("/", "");
		//d=d.replaceAll("/", "");
		d=d.replace(" ", "");
		System.out.println("UniqueNumber= "+d);

	}

}
