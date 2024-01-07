package com.ty.string1;

/*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
*/
public class MakeOutWord {
	public static String makeOutWord(String s1, String s2) {

		String str1 = "";
		String str2 = "";
		
		for (int i = 0; i <= (s1.length() - 1) / 2; i++) {
			str1 = str1 + s1.charAt(i);
		}
		for (int j = s1.length()-2; j<=s1.length()-1; j++) {
			str2 = str2 + s1.charAt(j);
		}
		return str1+s2+str2;
	}

	public static void main(String[] args) {
		System.out.println(makeOutWord("[[]]", "word"));
	}
}
