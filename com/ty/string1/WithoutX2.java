package com.ty.string1;

/*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
  and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"		*/
public class WithoutX2 {
	public static String withoutX2(String s) {

		String str1 = "";
		if (s.charAt(0) == 'x' && s.charAt(1) == 'x') {
			for (int i = 2; i <= s.length() - 1; i++) {
				str1 = str1 + s.charAt(i);
			}
			return str1;
		} else if (s.charAt(0) == 'x') {
			for (int i = 1; i <= s.length() - 1; i++) {
				str1 = str1 + s.charAt(i);
			}
			return str1;
		} else if (s.charAt(1) == 'x') {
			for (int i = 2; i <= s.length() - 1; i++) {
				str1 = str1 + s.charAt(0) + s.charAt(i);
			}
			return str1;
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(withoutX2("xHi"));
		System.out.println(withoutX2("Hxi"));
		System.out.println(withoutX2("Hi"));
	}
}
