package com.interviewbit.practice.bit;

import java.util.ArrayList;

public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(2);
		A.add(3);
		System.out.println(singleNumber(A));
	}
	
	public static int singleNumber(ArrayList<Integer> A){
		int res = 0,i;
		int len = A.size();
		for(i=0;i<len;i++){
			res = res ^ A.get(i);
		}
		return res;
	}

}
