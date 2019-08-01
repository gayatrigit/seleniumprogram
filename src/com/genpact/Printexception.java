package com.genpact;

public class Printexception {
	static String s;

	public static void main(String[] args) {
		try{
			System.out.println("1");
			//System.out.println(s.length());
			
			int i=s.length();
			
			System.out.println(s.charAt(i));
			System.out.println("2");
		}
		catch(ArithmeticException e){
			System.out.println("3");
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("4");
		}
		catch(Exception e){
			System.out.println("5");
		}
		finally
		{
			System.out.println("6");
		}
		
		
	}

}
