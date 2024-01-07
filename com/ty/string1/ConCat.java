package com.ty.string1;

/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"		*/
public class ConCat {
	public static String conCat(String s1, String s2) {
		
		String str1 = "";
		
		if(s1=="" || s2=="")
		{
			return s1+s2;
		}
		else if((s1.charAt(s1.length()-1)) == (s2.charAt(0))) {
			for(int i=1; i<=s2.length()-1; i++)
			{
				str1 = str1 + s2.charAt(i);
			}
			return s1+str1;
		}
	return s1+s2;
	}
	public static void main(String[] args) {
		System.out.println(conCat("abc", "cat"));
		System.out.println(conCat("dog", "cat"));
		System.out.println(conCat("abc", ""));
	}
}
