package com.sapient;

public class This {
String name="black";
This(String name){
	this.name=name;
}
	public static void main(String[] args) {
		This a=new This("white");
		System.out.println(a.name);
	}

}
