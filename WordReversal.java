/*  Write a program to reverse each individual word 
 * in a sentence.
 */

package com.training.Strings;

public class WordReversal {
	
	public static String reverseString(String s) {
		char[] ch = s.toCharArray();
		int n = ch.length;
		for(int i=0,j=n-1; i<n/2; i++,j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		return new String(ch);
	}
	
	public static String reverseWord(String s) {
		String[] strArr = s.split("\\s");
		String output = "";
		for(int i=0; i<strArr.length; i++) {
			output += reverseString(strArr[i]) + " ";
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		String s = "hi how are you";
		System.out.println("String after reversing each word "
				+ "in a sentence :"+reverseWord(s));

	}

}
