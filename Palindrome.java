/*  Write a program to check for a palindrome string. */


package com.training.Strings;

public class Palindrome {
	
	public static Boolean palindromeStr(String s) {
		int n = s.length();
		for(int i=0,j=n-1; i<n/2; i++,j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "Malayalam";
		System.out.println("String is Palindrome " +palindromeStr(s.toLowerCase()));
	}

}
