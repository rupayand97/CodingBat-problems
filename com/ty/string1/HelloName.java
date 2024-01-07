package com.ty.string1;

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"

public class HelloName
{
	public static String helloName(String s)
	{
		return "Hello "+ s;
	}
	public static void main(String[] args) {
		String s = "Bob";
		System.out.println(helloName(s));
	}
}