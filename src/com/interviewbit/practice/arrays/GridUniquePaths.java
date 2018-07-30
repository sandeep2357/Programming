package com.interviewbit.practice.arrays;

public class GridUniquePaths {

	public static void main(String[] args) {
		int A=220,B=1033;
		System.out.println(uniquePaths(A,B));
	}
	public static int uniquePaths(int A, int B) {
		if(A==1 || B==1) {
			return 1;
		}
		
		return uniquePaths(A-1, B)+uniquePaths(A, B-1);
	}

}
