package com.ty.string1;

/*Given a string and a second "word" string, we'll say that the word matches the string if it appears
at the front of the string, except its first char does not need to match exactly. On a match,
return the front of the string, or otherwise return the empty string. So, so with the string "hippo"
the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"			*/

public class StartWord {
	public static String startWord(String s1, String s2) {
		String str = "";
		for (int i = 1; i <= s2.length() - 1; i++) {
			if (s2.charAt(i) == s1.charAt(i)) {
				str = str + s1.charAt(i);
			}
		}
		return s1.charAt(0) + str;
	}

	public static void main(String[] args) {
		System.out.println(startWord("hippo", "hi"));
		System.out.println(startWord("hippo", "xip"));
		System.out.println(startWord("hippo", "i"));
	}
}