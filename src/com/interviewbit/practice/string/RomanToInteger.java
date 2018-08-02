package com.interviewbit.practice.string;

import java.util.HashMap;

public class RomanToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String A = "XLCD";
		System.out.println(romanToInt(A));
	}
	
	public static int romanToInt(String A){
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		h.put('I', 1);
		h.put('V', 5);
		h.put('X', 10);
		h.put('L', 50);
		h.put('C', 100);
		h.put('D', 500);
		h.put('M', 1000);
		int len = A.length();
		int i,sum=0;
		for(i=0;i<len-1;i++){
			if(h.get(A.charAt(i+1))>h.get(A.charAt(i))){
				sum = sum - h.get(A.charAt(i));
			}else{
				sum = sum + h.get(A.charAt(i));
			}
		}
		sum = sum + h.get(A.charAt(i));
		return sum;
	}

}
