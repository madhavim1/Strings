/* Write a program which accepts a string like 
 * "This is nice" and converts it to a string 
 * like "This1 is2 nice3".
 */


package com.training.Strings;

public class StringConversion {
	
	public static String convertString(String s) {
		String[] strArr = s.split("\\s");
		String output = "";
		for(int i=0; i<strArr.length; i++) {
			output += strArr[i] + (i+1) + " ";
		}
		
		return output;
	}

	public static void main(String[] args) {
		String s = "This is nice one";
		System.out.println("The string after conversion :" 
				+convertString(s));
	}

}
