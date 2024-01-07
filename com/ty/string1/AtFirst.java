package com.ty.string1;

/*Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2,
use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"*/
public class AtFirst {
	public static String atFirst(String s) {
		String str = "";
		if (s.length() >= 2) {
			str = str + s.charAt(0) + s.charAt(1);
		} else if (s.length() == 1) {
			str = str + s.charAt(0) + '@';
		} else {
			return "@@";
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(atFirst("hello"));
		System.out.println(atFirst("hi"));
		System.out.println(atFirst("h"));
	}
}
