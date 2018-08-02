package com.interviewbit.practice.string;

import java.util.ArrayList;

public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
		A.add("nick");
		A.add("nice");
		A.add("nice");
		A.add("nide0e");
		System.out.println(longestCommonPrefix(A));
	}
	public static String longestCommonPrefix(ArrayList<String> A) {
		int len = A.size();
		int i,j,k,max = Integer.MAX_VALUE;
		int res = 0;
		for(i=0;i<len-1;i++){
			int res2 = res;
			for(j=i+1;j<len;j++){
				k = commonPrefix(A.get(i),A.get(j));
				if(k < max){
					max = k;
					res = i;
				}
			}
			//k= commonPrefix(A.get(res2), A.get(res));
		}
		String m = A.get(res).substring(0,max);
		return m;
	}
	private static int commonPrefix(String A, String B) {
		int i=0;
		int len1 = A.length();
		int len2 = B.length();
		while(i<len1 && i<len2 && A.charAt(i)==B.charAt(i)){
			i++;
		}
		
		return i;
	}

}
