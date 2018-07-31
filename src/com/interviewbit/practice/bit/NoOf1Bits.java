package com.interviewbit.practice.bit;

public class NoOf1Bits {

	public static void main(String[] args) {
		int A = 65532;
		System.out.println(onesCount(A));
	}
	
	public static int onesCount(int A) {
		int i=0;
		while(A>0) {
			if((A & 1) >0) {
				i++;
			}
			A= A>>1;
		}
		return i;
	}

}
