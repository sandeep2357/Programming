package com.interviewbit.practice.twopointers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaximumArea {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(5);
		A.add(4);
		A.add(3);
		System.out.println(maxArea(A));
	}
	
	public static int maxArea(ArrayList<Integer> A) {
		int len = A.size();
		int i=0,j=len-1;
		int maxarea = Integer.MIN_VALUE;
		while(i<j) {
			maxarea = Math.max(maxarea, Math.min(A.get(i), A.get(j))*(j-i));
			if(A.get(i)<A.get(j)) {
				i++;
			}else {
				j--;
			}
		}
		return maxarea;
    }

}
