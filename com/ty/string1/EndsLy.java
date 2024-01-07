package com.ty.string1;
/*Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false */

public class EndsLy {

	public static boolean endsLy(String str) {
		if((str.charAt(str.length()-2)=='l')&&(str.charAt(str.length()-1)=='y'))
		{
			return true;
		}
		else
		{
			return false;
		}
		  
	}
	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
	}
}
