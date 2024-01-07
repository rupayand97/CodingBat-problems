package com.ty.string1;

/*Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
*/
public class WithouEnd2 {
	
	public static String withoutEnd2(String s) {
		String s1 ="";
		for(int i=1; i<=s.length()-2; i++)
		{
			s1 = s1 + s.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args) {
		System.out.println(withoutEnd2("abc"));
	}
}
