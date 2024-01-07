package com.ty.string1;

/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false*/

public class HasBad {
	public static Boolean hasBad(String s) {
		for(int i=0; i<=s.length()-1; i++)
		{
			if(((s.charAt(0)=='b')|| (s.charAt(1)=='b')) && ((s.charAt(1)=='a')||(s.charAt(2)=='a')) && ((s.charAt(2)=='d')||(s.charAt(3)=='d')))
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(hasBad("xxbadxx"));
	}
}
