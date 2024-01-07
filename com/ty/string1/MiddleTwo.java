package com.ty.string1;

/*Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"		*/
public class MiddleTwo {
	public static String middleTwo(String s) {
		String str = "";
		for(int i=(s.length()-1)/2; i<=((s.length()-1)/2)+1 ;i++) {
			str = str + s.charAt(i);
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(middleTwo("string"));
		System.out.println(middleTwo("code"));
		System.out.println(middleTwo("Practice"));
		System.out.println(middleTwo("hi"));
	}
}
