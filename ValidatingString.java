/*  Write a program to check if a given string of 
 * parenthesis has balanced parenthesis or not. 
 * For example a string as "(())" is a valid string 
 * where as strings like ")(" or "(()))" are not 
 * valid strings.
 */

package com.training.Strings;

public class ValidatingString {
	
	public static Boolean validateString(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);
		    if(c == '(') 
		    	count++;
		    else if(c == ')')
		    	count--;
		    if(count<0)
		    	return false;
		}
		return count==0;
	}

	public static void main(String[] args) {
		String s = "))((";
		System.out.println("String has a balanced paranthesis :" +
										validateString(s));
	}
}
