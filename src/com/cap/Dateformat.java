package com.cap;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd/mm/yy");
		System.out.println(s.format(d));

	}

}
