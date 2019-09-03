package com.question;

import java.sql.SQLException;
class A {
	public void methd() throws Exception
	{
		System.out.println("parent");
	}	
}
 
class ChildExceptionoverride extends A
{
 public void methd() throws SQLException 
	{
		System.out.println("child");
	}

	
	public static void main(String[] args) throws Exception {
		ChildExceptionoverride e=new ChildExceptionoverride();
	   e.methd();
	}
}