package com.example;

public class CastIntToByteTest {
	public static void main(String[] args) {
		//byte range lies between -128, 127
		/*
		 * n = 290
		 * n/2 ->  res  -> remainder
		 * 290/2 -> 145 -> 0
		 * 145/2 -> 72 ->  1
		 * 72/2 -> 36 ->   0
		 * 36/2 -> 18 ->   0
		 * 18/2 -> 9 ->	   0
		 * 9/2 -> 4 ->	   1
		 * 4/2 -> 2 ->	   0
		 * 2/2 -> 1 -> 	   0
		 * 1/0 -> 0 ->	   1
		 * 
		 * read number from reverse = 1 0010 0010 - > 
		 * 
		 * in java ignore higher bits -> 0010 0010 binary
		 * [0]  [0]  [1]  [0]   [0]  [0]   [1]   [0]
		 * 2^7  2^6  2^5  2^4	2^3  2^2   2^1	 2^0
		 * 			 32					    2			32 + 2 = 34
		 * 									
		 */
		
		int i = 290;
		byte b = (byte) i;
		
		System.out.println(b);
		
	}
}
