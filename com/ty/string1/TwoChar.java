package com.ty.string1;

/*Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars.
The string length will be at least 2.

twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"	*/
public class TwoChar {
	public static String twoChar(String s, int n) {
		
		String str = "";
		
		if(n==0)
		{
			str = str + s.charAt(0)+s.charAt(1);
		}
		else if(n>s.length()-2)
		{
			str = str + s.charAt(0)+s.charAt(1);
		}
		else
		{
			for(int i=n; i<= n+1; i++)
			{
				str = str + s.charAt(i);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(twoChar("java", 0));
		System.out.println(twoChar("java", 2));
		System.out.println(twoChar("java", 3));
	}
}
