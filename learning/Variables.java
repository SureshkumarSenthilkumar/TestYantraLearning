package com.tyss.learning;

public class Variables {
	 void sum(int a,long b){System.out.println("a method invoked");}  
	 void sum(long a,int b){System.out.println("b method invoked");}  
	  
	  public static void main(String args[]){  
	  Variables obj=new Variables();  
	  obj.sum(20l,20);//now ambiguity  
	  }  
}
