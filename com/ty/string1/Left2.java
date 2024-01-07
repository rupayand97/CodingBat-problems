package com.ty.string1;

/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"	*/
public class Left2 {
	
	public static String left2(String s) {
		String s1 = "";
		String s2 = "";
		
		for(int i=0; i<=1; i++)
		{
			s1 = s1 + s.charAt(i);
		}
		for(int j=2; j<=s.length()-1; j++)
		{
			s2 = s2 + s.charAt(j);
		}
		return s2+s1;
	}

	public static void main(String[] args) {
		System.out.println(left2("hello"));
		System.out.println(left2("java"));
		System.out.println(left2("hi"));
	}
}
