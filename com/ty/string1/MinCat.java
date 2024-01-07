package com.ty.string1;
/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is the same length
as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"		*/

public class MinCat {
	public static String minCat(String s1, String s2) {
		String str = "";
		String str2 = "";
		if (s1.length() > s2.length()) {
			for (int i = s1.length() - s2.length(); i <= s1.length() - 1; i++) {
				str = str + s1.charAt(i);
			}
			return str + s2;
		} else {
			for (int i = s2.length() - s1.length(); i <= s2.length() - 1; i++) {
				str2 = str2 + s2.charAt(i);
			}
			return s1 + str2;
		}
	}

	public static void main(String[] args) {
		System.out.println(minCat("Hello", "Hi"));
		System.out.println(minCat("Hello", "java"));
		System.out.println(minCat("java", "Hello"));
	}
}
