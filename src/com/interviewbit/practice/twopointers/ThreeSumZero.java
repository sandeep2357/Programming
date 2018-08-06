package com.interviewbit.practice.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ThreeSumZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
		Collections.sort(A);
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); 
	    for (int i = 0; i < A.size()-2; i++) {
	        if (i == 0 || (i > 0 && A.get(i).intValue() != A.get(i-1).intValue())) {
	            int lo = i+1, hi = A.size()-1, sum = 0 - A.get(i);
	            while (lo < hi) {
	                if (A.get(lo).intValue() + A.get(hi).intValue() == sum) {
	                    res.add((ArrayList)Arrays.asList(A.get(i), A.get(lo), A.get(hi)));
	                    while (lo < hi && A.get(lo).intValue() == A.get(lo+1).intValue()) lo++;
	                    while (lo < hi && A.get(hi).intValue() == A.get(hi-1).intValue()) hi--;
	                    lo++; hi--;
	                } else if (A.get(lo) + A.get(hi).intValue() < sum) lo++;
	                else hi--;
	           }
	        }
	    }
	    return res;
    }

}
