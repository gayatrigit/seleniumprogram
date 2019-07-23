package com.stringprogram;

public final class Immutable
{
	final String name;
	final int rollno;
	public Immutable(String name, int rollno )
	{
		this.name=name;
		this.rollno=rollno;
	}
	public String getname()
	{
		return name;
	}
	public int getrollno()
	{
		return rollno;
	}
}


