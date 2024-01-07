package com.ty.string1;

/* Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o" */

public class TheEnd {
	public static String theEnd(String s, Boolean b)
	{
		String s1="";
		if(b==true)
		{
			s1= s1+ s.charAt(0);
		}
		else {
			s1=s1 + s.charAt(s.length()-1);
		}
		return s1;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(theEnd("Hello", true));
	}
}
