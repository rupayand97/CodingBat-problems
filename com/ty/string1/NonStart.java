package com.ty.string1;

/* Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava" */

public class NonStart {
	public static String nonStart(String s1, String s2)
	{
		String s3="";
		
		for(int i=1; i<=s1.length()-1; i++)
		{
			s3=s3+ s1.charAt(i);
		}
		for(int j=1; j<=s2.length()-1;j++)
		{
			s3=s3+s2.charAt(j);
		}
		return s3;	
	}
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="There";
		
		System.out.println(nonStart(s1, s2));
		
	}
}
