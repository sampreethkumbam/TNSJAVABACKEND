package com.tns.primitivedatatypes;

public class PrimitiveDatatype {
	public static void main(String[] args) {
	//byte-1byte	
	// range of byte -128 to 127
	byte bytemax=127;
	byte bytemin=-128;
	System.out.println("Min range of byte:"+bytemin+" "+"Max range of byte:"+bytemax);
	
	//short-2bytes
	short shortmin=-32768;
	short shortmax=32767;
	System.out.println("Min range of short:"+shortmin+" "+"Max range of short:"+shortmax);
	
	// int -4bytes
	int minint=-2147483648;
	int maxint=2147483647;
	System.out.println("Min range of int:"+minint+" "+"Max range of int:"+maxint);
	
	//long -8bytes
	long minlong=-9223372036854775808L;
	long maxlong=9223372036854775807L;
	System.out.println("Min range of long:"+minlong+" "+"Max range of long:"+maxlong);
	
	//float and double
	float f=548.34567677767675f;
	double d=922.3372036854775807498575786f;
	System.out.println("float value is:"+f+" "+"double value is:"+d);
	
	//boolean 
	boolean flag=false;
	System.out.println("boolean value is:"+flag);
	
	}
}
