package com.ty.string1;

/* Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@" */

public class LastChars {
	
	public static String lastChars(String s1, String s2)
	{
		String s3="";
		if(s2=="")
		{
			s3 = s3 + s1.charAt(0) + "@";
		}
		else
		{
			s3 = s3 + s1.charAt(0) + s2.charAt(s2.length()-1);
		}
		
		return s3;
	}
		
	public static void main(String[] args) {
		System.out.println(lastChars("last", ""));
	}
	
}
