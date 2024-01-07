package com.ty.string1;

/*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/
public class MiddleThree {
	public static String middleThree(String s)
	{
		String s1="";
		for(int i=(s.length()-1)/3; i<=((s.length()-1)/3)+2 ;i++)
		{
			s1 = s1 + s.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args)
	{
		System.out.println(middleThree("Candy"));
	}
}
