package com.interviewbit.practice.arrays;

public class PowerOf2Integers {

	public static void main(String[] args) {
		int A=35;
		System.out.println(isPower(A));

	}
	
	public static int isPower(int A) {
		if(A<=1) {
			return 1;
		}
		for(int x=2;x<=Math.sqrt(A);x++) {
			int p = x;
			while(p<=A && p>0) {
				p=p*x;
				if(p==A) {
					return 1;
				}
			}
		}
		return 0;
    }

}
