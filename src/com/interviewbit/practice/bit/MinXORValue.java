package com.interviewbit.practice.bit;

import java.util.ArrayList;
import java.util.Collections;

public class MinXORValue {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(4);
		A.add(7);
		A.add(9);
		System.out.println(findMinXor(A));
	}
	
	public static int findMinXor(ArrayList<Integer> A) {
		/*int min = Integer.MAX_VALUE;
		int i,j;
		for(i=0;i<A.size()-1;i++) {
			for(j=i+1;j<A.size();j++) {
				if(min > (A.get(i) ^ A.get(j))) {
					min = A.get(i) ^ A.get(j);
				}
			}
		}
		return min;*/
		int min = Integer.MAX_VALUE;
		int i;
		Collections.sort(A);
		for(i=0;i<A.size()-1;i++) {
			if(min > (A.get(i) ^ A.get(i+1))) {
				min = A.get(i) ^ A.get(i+1);
			}
		}
		return min;
    }

}
