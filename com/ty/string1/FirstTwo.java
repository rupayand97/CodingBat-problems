package com.ty.string1;
/*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X",
and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"		*/

public class FirstTwo {
	public static String firstTwo(String s) {
		
		String str = "";

		if(s.length() >= 2) {
			str = str + s.charAt(0) + s.charAt(1);
		}
		else {
			str = str + s;
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo("a"));
		System.out.println(firstTwo(""));
	}
}
