package com.interviewbit.practice.bit;

public class DivideIntegers {

	public static void main(String[] args) {
		int A = -2147483648;
//		int A = -2435;
		int B = 1;
		System.out.println(divideIntegers(A, B));
	}
	
	public static int divideIntegers(int A, int B) { 
		if(A==0) {
			return 0;
		}else if(B==0 ) {
			return Integer.MAX_VALUE;
		}
		
		if(B==1) {
			return A;
		}
		boolean neg = false;
		if(A<0 && B<0) {
			A= A==Integer.MIN_VALUE?Math.abs(A+1):Math.abs(A);
			B= B==Integer.MIN_VALUE?Math.abs(B+1):Math.abs(B);
			neg = false;
		}else if(A<0 || B<0) {
			neg = true;
			A = A==Integer.MIN_VALUE?Math.abs(A+1):Math.abs(A);
			B = B==Integer.MIN_VALUE?Math.abs(B+1):Math.abs(B);
		}
		//System.out.println(Math.abs(-2147483648+1));
		int count = 0;
		while(A>=0) {
			A= A-B;
			count++;
		}
		count = count - 1;
		if(neg) {
			count = -1 * count;
		}
		return count;
	}

}
