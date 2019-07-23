package com.questglobal;

public class Fibonaciwithoutfunction {
	static int prevn=0;
	static int nextn=1;
	static int sum;
	 void printfb(int n){
		 
		 if(n>=1){
			 System.out.println(prevn);
		 sum=prevn+nextn;
		 
		 prevn=nextn;
		 nextn=sum;
		 printfb(n-1);
		 }
	 }

	public static void main(String[] args) {
		
    //System.out.println(prevn+" "+nextn);
    Fibonaciwithoutfunction f= new Fibonaciwithoutfunction();
    f.printfb(5);
	}

}
