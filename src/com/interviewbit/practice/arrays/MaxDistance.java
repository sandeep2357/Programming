package com.interviewbit.practice.arrays;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MaxDistance {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(4);
		A.add(3);
		A.add(2);
		System.out.println(maximumGap(A));
	}
	public static int maximumGap(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        int len = A.size();
        int curDiff;
        for(int i=0;i<len;i++) {
        	for(int j=i;j<len;j++) {
        		if(A.get(i)<=A.get(j)) {
        			curDiff = j-i;
        			max = max<curDiff? curDiff:max;
        		}
        	}
        }
        if(max==Integer.MIN_VALUE) {
        	max=-1;
        }
        return max;
    }

}
