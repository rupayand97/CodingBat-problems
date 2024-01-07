package com.ty.string1;

/*Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning,
 * so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""		*/
public class Without2 {
	public static String without2(String s)	{
		String s1 = "";
		
		if((s.charAt(0) == s.charAt(s.length()-2)) && (s.charAt(1) == s.charAt(s.length()-1))) {
			for(int i=2; i<=s.length()-1; i++)
			{
				s1 = s1 + s.charAt(i);
			}
			return s1;
		}
		
		return s;
	}
	public static void main(String[] args) {
		System.out.println(without2("HelloHe"));
		System.out.println(without2("HelloHi"));
		System.out.println(without2("Hi"));
	}
}
