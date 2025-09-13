package com.tns.typecasting;

public class TypecastingDemo {
	public static void main(String[] args) {
		
		//implicit or widening type casting
		// byte - int
		byte b=20;
		int i=b;
		System.out.println(i);
		
		//int - float
		int n=27;
		float ff=n;
		System.out.println(ff);
		
		// float - double
		float f=2.890f;
		double d=f;
		System.out.println(d);
		
		//char - int
		char c='A';
		int i1=c;
		System.out.println(i1);
		
		// char - int
		char c1='\u00A8';
		int i2=c1;
		System.out.println(i2);
		
		//explicit or narrowing type casting
		//float - int
		float f1=19.348f;
		int i3=(int)f1;
		System.out.println(i3);
		
		// double - long
		double d1=324.327487f;
		long l=(long)d1;
		System.out.println(l);
		
		//long - int
		long l1=3243444554689586L;
		int i4=(int)l1;
		System.out.println(i4);
		
		//byte - char
		byte b1=100;
		char ch2=(char)b1;
		System.out.println(ch2);
	}
}
