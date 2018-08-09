package com.interviewbit.practice.dp;

public class ScrambleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "ABCDE ";
		String B = "CDABE";
		System.out.println(isScramble(A, B));
	}
	public static int isScramble(final String A, final String B) {
		String s1 = A.trim();
		String s2 = B.trim();
		
		if (s1.equals(s2)) return 1; 
	    
	    int[] letters = new int[26];
	    for (int i=0; i<s1.length(); i++) {
	        letters[(s1.charAt(i)|32)-'a']++;
	        letters[(s2.charAt(i)|32)-'a']--;
	    }
	    for (int i=0; i<26; i++) if (letters[i]!=0) return 0;

	    for (int i=1; i<s1.length(); i++) {
	        if (isScramble(s1.substring(0,i), s2.substring(0,i)) > 0 
	         && isScramble(s1.substring(i), s2.substring(i))>0) return 1;
	        if (isScramble(s1.substring(0,i), s2.substring(s2.length()-i))>0 
	         && isScramble(s1.substring(i), s2.substring(0,s2.length()-i))>0) return 1;
	    }
	    return 0;
    }
	

}
