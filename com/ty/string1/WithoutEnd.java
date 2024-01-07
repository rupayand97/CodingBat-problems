package com.ty.string1;

/*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"*/

public class WithoutEnd {
	public static String withoutEnd(String s)
	{
		String s1 = "";
		for(int i=1; i<=s.length()-2; i++)
		{
			s1 = s1 + s.charAt(i);
		}
		return s1;
		
	}
	public static void main(String[] args) {
		System.out.println(withoutEnd("coding"));
	}
}
