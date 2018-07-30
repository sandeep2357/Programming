package com.interviewbit.practice.arrays;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;

public class LargestCoprimeDivisor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A = 2;
		int B = 2;
		System.out.println(gcd(22,38));
		System.out.println(cpFact(A,B));
	}
	
	
	
	public static int cpFact(int A, int B) {
		int x = gcd(A,B);
		while(x!=1){
			A = A/x;
			x=gcd(A,B);
		}
		return A;
    }
	
	public static int gcd(int A, int B){
		if(A==0 || B==0){
			return A==0?B:A;
		}
		if(A==B){
			return A;
		}
		if(A>B){
			return gcd(B,A%B);
		}else{
			return gcd(A,B%A);
		}
	}

}
