package com.ty.string1;
/*Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH" */
public class ExtraFront {
	public static String extraFront(String s)
	{
		String s1 = "";
		
		if (s.length() > 1)
		{
			for (int i = 0; i <= 1; i++)
			{
				s1 = s1 + s.charAt(i);

			}
			return s1 + s1 + s1;
		}
		else
		{
			return s + s + s;
		}
	}
	public static void main(String[] args) {
		System.out.println(extraFront("hello"));
	}
}
