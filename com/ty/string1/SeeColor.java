package com.ty.string1;
/*Given a string, if the string begins with "red" or "blue" return that color string,
  otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue" */

public class SeeColor {
	
	public static String seeColor(String s)
	{
		String s3="";
		if((s.charAt(0)=='r')&&(s.charAt(1)=='e')&&(s.charAt(2)=='d'))
		{
			s3 = s3+ s.charAt(0) + s.charAt(1) + s.charAt(2);
		}
		else if((s.charAt(0)=='b')&&(s.charAt(1)=='l')&&(s.charAt(2)=='u')&&(s.charAt(3)=='e'))
		{
			s3 = s3+ s.charAt(0) + s.charAt(1) + s.charAt(2) + s.charAt(3);
		}
		
		return s3;
		
	}
	
	public static void main(String[] args) {
		System.out.println(seeColor("redxx"));
	}
}
