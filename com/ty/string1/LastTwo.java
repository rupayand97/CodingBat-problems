package com.ty.string1;

/*Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"		*/

public class LastTwo {
	public static String lastTwo(String s) {
		String str = "";
		String str2 = "";
		for (int i = s.length() - 1; i >= s.length() - 2; i--) {
			str = str + s.charAt(i);
		}
		for (int i = 0; i <= s.length() - 3; i++) {
			str2 = str2 + s.charAt(i);
		}
		return str2 + str;
	}

	public static void main(String[] args) {
		System.out.println(lastTwo("coding"));
		System.out.println(lastTwo("cat"));
		System.out.println(lastTwo("ab"));
	}
}
