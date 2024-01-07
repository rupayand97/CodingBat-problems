package com.ty.string1;

/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"*/

public class WithoutX {
	public static String withoutX(String s) {
		String s1="";
		
		if((s.charAt(0)=='x') && (s.charAt(s.length()-1)=='x')) {
			for(int i=1; i<=s.length()-2; i++)	{
				s1 = s1 + s.charAt(i);
			}
			return s1;
		}
		else if((s.charAt(0)=='x'))	{
			for(int i=1; i<=s.length()-1; i++)	{
				s1 = s1 + s.charAt(i);
			}
			return s1;
		}
		else if((s.charAt(s.length()-1)=='x'))	{
			for(int i=0; i<=s.length()-2; i++)	{
				s1 = s1 + s.charAt(i);
			}
			return s1;
		}		
		return s;
	}

	public static void main(String[] args) {
		System.out.println(withoutX("xHix"));
		System.out.println(withoutX("xHi"));
		System.out.println(withoutX("Hxix"));
	}
}
