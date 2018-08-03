package com.interviewbit.practice.string;

public class CountAndSay {

	public static void main(String[] args) {
		int n =3;
		System.out.println(countAndSay(n));
	}
	public static String countAndSay(int A) {
		int i;
		int count = 0;
		String start = "1";
		String res = "";
		for(i=0;i<A-1;i++) {
			char c = start.charAt(0);
			int startLen = start.length();
			int j=0;
			while(j<startLen) {
				c = start.charAt(j);
				count = 0;
				while(j<startLen && start.charAt(j)==c) {
					count++;
					j++;
				}
				res = res + (count!=0?count:"") + c;
				if(count==0) {
					j++;
				}
			}
			start = res;
			res="";
		}
		return start;
    }

}
