package com.interviewbit.practice.bit;

import java.util.ArrayList;

public class DifferentBitsSumPairwise {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(5);
		System.out.println(cntBits(A));
	}
	
	public static int cntBits(ArrayList<Integer> A) {
		int i,j,len=A.size();
		int MOD = 1000000007;
		int sum = 0,count = 0;
		for(i=0;i<32;i++) {
			count =0;
			for(j=0;j<len;j++) {
				if((A.get(j)&(1<<i))>0) {
					count++;
				}
			}
			
			sum = sum % MOD + count * (len-count)*2;
			sum = sum % MOD;
		}
		/*for(i=0;i<len;i++) {
			for(j=0;j<len;j++) {
				sum = (sum % MOD)+onesCount(A.get(i)^A.get(j));
				sum = sum % MOD;
			}
		}*/
		return sum;
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
