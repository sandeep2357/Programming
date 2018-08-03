package com.interviewbit.practice.string;

public class AddBinaryStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String A = "101";
		String B = "11";
		System.out.println(addBinary(A, B));
	}
	
	public static String addBinary(String A, String B) {
		StringBuilder res = new StringBuilder();
		int carry = 0;
		int temp;
		int i = A.length()-1;
		int j = B.length()-1;
		while(i>=0 && j>=0){
			temp = A.charAt(i)-'0'+B.charAt(j)-'0'+carry;
			res.append(temp%2);
			carry = (A.charAt(i)-'0'+B.charAt(j)-'0'+carry)/2;
			i--;
			j--;
		}
		while(i>=0){
			temp = A.charAt(i)-'0'+carry;
			res.append(temp%2);
			carry = (A.charAt(i)-'0'+carry)/2;
			i--;
		}
		while(j>=0){
			temp = B.charAt(j)-'0'+carry;
			res.append(temp%2);
			carry = (B.charAt(j)-'0'+carry)/2;
			j--;
		}
		if(carry>0){
			res.append(carry);
		}
		res = res.reverse();
		return res.toString();
    }

}
