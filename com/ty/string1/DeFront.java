package com.ty.string1;

/*Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"	*/
public class DeFront {
	public static String deFront(String s) {
		String str = "";
		String str2 = "";
		if (s.charAt(0) == 'a' && s.charAt(1) == 'b') {
			str = str + s;
		} else if (s.charAt(0) == 'a') {
			for (int i = 2; i <= s.length() - 1; i++) {
				str2 = str2 + s.charAt(i);
			}
			return s.charAt(0) + str2;
		} else if (s.charAt(1) == 'b') {
			for (int i = 1; i <= s.length() - 1; i++) {
				str = str + s.charAt(i);
			}
		} else {
			for (int i = 2; i <= s.length() - 1; i++) {
				str = str + s.charAt(i);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(deFront("Hello"));
		System.out.println(deFront("java"));
		System.out.println(deFront("away"));
	}
}
