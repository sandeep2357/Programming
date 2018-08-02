package com.interviewbit.practice.string;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "the sky is      blue";
		System.out.println(reverseWords(a));
	}
	
	public static String reverseWords(String a) {
		String[] parts = a.split(" ");
		int i,len = parts.length;
//		System.out.println(len);
		String ans = "";
		for(i=len-1;i>0;i--){
			if(parts[i].compareTo("")!=0){
				ans = ans + parts[i]; 
				ans = ans + " ";
			}
		}
		ans = ans + parts[i];
		return ans;
    }

}
