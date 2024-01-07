package com.ty.string1;

/*Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
*/
public class FrontAgain {
	
	public static Boolean frontAgain(String s) {
		
		for(int i=0; i<=s.length()-1; i++)
		{
			if((s.charAt(0) == s.charAt(s.length()-2)) && (s.charAt(1) == s.charAt(s.length()-1)))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(frontAgain("edit"));
	}
}
