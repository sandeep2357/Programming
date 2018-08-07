package com.interviewbit.practice.twopointers;

import java.util.List;

public class Array3Pointers {

	public static void main(String[] args) {
		
	}
	public static int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
		int l1 = A.size(),l2 = B.size(),l3 = C.size();
        int i=0,j=0,k=0;
        int diff = Integer.MAX_VALUE;
        while(i<l1 && j<l2 && k<l3) {
            int mini = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
            int maxi = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));
            if(maxi-mini<diff) {
                diff = maxi-mini;
            }
            if(diff==0) {
                return 0;
            }
            
            if(A.get(i).intValue()==mini) {
                i++;
            }else if(B.get(j).intValue()==mini) {
                j++;
            }else {
                k++;
            }
        }
        
        return diff;
    }

}
