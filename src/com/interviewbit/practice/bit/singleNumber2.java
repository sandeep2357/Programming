package com.interviewbit.practice.bit;

import java.util.ArrayList;

public class singleNumber2 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(2);
		System.out.println(singleNumber2(A));
	}
	
	public static int singleNumber2(ArrayList<Integer> A) {
		int temp=0,res=0;
		int i,j;
		for(i=0;i<=32;i++) {
			temp = 0;
			for(j=0;j<A.size();j++) {
				if(((A.get(j)>>i) & 1) == 1){
					temp++;
					temp = temp % 3;
				}
			}
			if(temp!=0) {
				res = res | 1 << i;
			}
		}
		return res;
	}

}
