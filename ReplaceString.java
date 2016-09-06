/* Write a program to find a substring 
 * in a given string and then replace it 
 * with another string.
 */

package com.training.Strings;

public class ReplaceString {

	public static String replaceSubStr(String s , String subStr, 
			String replaceStr) {
		char[] charArr = new char[s.length()-subStr.length()+replaceStr.length()];
		int pos = s.indexOf(subStr);
		int k=0;
		for(int i=0; i<pos; i++) {
			charArr[k++] = s.charAt(i);
		}
		for(int i=0; i<replaceStr.length(); i++) {
			charArr[k++] = replaceStr.charAt(i);
		}
		for(int i=pos+subStr.length(); i<s.length(); i++) {
			charArr[k++] = s.charAt(i);
		}
		return new String(charArr);
	}
	
	public static void main(String[] args) {
		try {
			String s = "HiStrawBerry";
			String subStr = "Straw";
			String replaceStr = "Blue";
			System.out.println("The string after replacing substring is :" 
				+replaceSubStr(s, subStr, replaceStr));
		} catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}

	}

}
