package com.ty.string1;

/*Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/
public class NTwice {
	
	public static String nTwice(String s, int n)
	{
		String s1 = "";
		String s2 = "";
		
		for(int i=0; i<=n-1; i++) {
			s1 = s1 + s.charAt(i);
		}
		
		for(int j=s.length()-n; j<=s.length()-1; j++) {
			s2 = s2 + s.charAt(j);
		}
		return s1+s2;
	}
	
	public static void main(String[] args) {
		System.out.println(nTwice("Chocolate", 1));
	}
}
