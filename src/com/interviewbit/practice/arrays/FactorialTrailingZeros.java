package com.interviewbit.practice.arrays;

public class FactorialTrailingZeros {

	public static void main(String[] args) {
		int N=235674;
		System.out.println(trailingZeros(N));
	}
	
	public static int trailingZeros(int N) {
		int i=5;
		int count = 0;
		while(i<=N) {
			count = count + N/i;
			i=i*5;
		}
		return count;
	}

}
