package com.interviewbit.practice.string;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A= "HelloWorld    ,";
		System.out.println(lengthOfLastWord(A));
	}
	
	public static int lengthOfLastWord(final String A) {
		int i,len = A.length();
		int j;
		if(len<=0) {
			return 0;
		}
		i=len-1;
		while(i>=0 && A.charAt(i)==' ') {
			i--;
		}
		j=i;
		if(i<0) {
			return 0;
		}
		while(i>=0 && A.charAt(i)!=' ') {
			i--;
		}
		
		return j-i;
	}

}
