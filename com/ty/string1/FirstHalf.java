package com.ty.string1;
/* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc" */

public class FirstHalf {
	public static String firstHalf(String s)
	{
		String s2 ="";
		for(int i=0; i<=(s.length()-1)/2; i++)
		{
			s2 = s2 +  s.charAt(i);
		}
		return s2;
	}
	
	public static void main(String[] args) {

		String s = "WooHoo";
		System.out.println(firstHalf(s));
	}
}
