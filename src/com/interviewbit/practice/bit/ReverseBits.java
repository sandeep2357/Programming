package com.interviewbit.practice.bit;

public class ReverseBits {

	public static void main(String[] args) {
		int A = 65532;
		printBits(A);
		int temp = reverseBits(A);

		System.out.println(temp);

		printBits(temp);
	}
	
	public static int reverseBits(int A) {
		int temp = 0;
		while(A>0) {
			temp = temp * 2 + (A & 1);
			A = A>>1;
		}
		return temp;
	}
	
	public static void printBits(int A) {
		while(A>0) {
			System.out.print(A & 1);
			A=A>>1;
		}
		System.out.println();
	}

}
