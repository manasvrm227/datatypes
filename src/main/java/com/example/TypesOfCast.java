package com.example;

public class TypesOfCast {
	public static void main(String[] args) {

		// Implicit cast - smaller value is assigned to bigger data type
		int i = 200;
		long l = i;
		System.out.println(l);
		
		// Explicit cast - larger value assigned to smaller data type
		float f = 234.345f;
		int i1 = (int) f;
		
		System.out.println(i1);
	}
}
