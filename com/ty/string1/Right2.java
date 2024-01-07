package com.ty.string1;
/*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"		*/

public class Right2 {
	public static String right2(String s)
	{
		String s1 = "";
		String s2 = "";
	
		s1 = s1 + s.charAt(s.length() - 2) + s.charAt(s.length() - 1);

		for (int i = 0; i <= s.length() - 3; i++)
		{
			s2 = s2 + s.charAt(i);
		}
		
		return s1 + s2;
	}

	public static void main(String[] args) {
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
	}
}
