/*  Write a program to reverse a string. 
 * Do not use StringBuffer/StringBuilder 
 * inbuilt reverse function.
 */

package com.training.Strings;

import java.util.Scanner;

public class StringReversal {
	
	public static String reverseString(String s) {
		//hello
		char[] ch = s.toCharArray();
		int n = ch.length;
		for(int i=0,j=n-1; i<n/2; i++,j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = scanner.next();
		System.out.println("String reverse :"+reverseString(s));

		
	}

}
