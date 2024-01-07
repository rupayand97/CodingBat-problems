package com.ty.string1;

/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"*/

public class ExtraEnd {
	public static String extraEnd(String s) {
		String s1 = "";
		String s2 ="";
		for(int i=s.length()-2; i<=s.length()-1; i++)
		{
			s1 = s1 + s.charAt(i);	
		}
		s2 = s2 + s1 + s1 + s1;
		return s2;
	}
	public static void main(String[] args) {
		System.out.println(extraEnd("Hello"));
	}
}
