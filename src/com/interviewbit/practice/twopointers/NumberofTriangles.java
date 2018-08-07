package com.interviewbit.practice.twopointers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumberofTriangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(2);
		System.out.println(nTriang(a));
	}
	
	public static int nTriang(ArrayList<Integer> A) {
		int len = A.size();
		int i,j,k;
		int count = 0;
		int MOD = 1000000007;
		Collections.sort(A);
		for(i=0;i<len-2;i++){
			k=i+2;
			for(j=i+1;j<len-1;j++){
				while(k<len && A.get(i)+A.get(j)>A.get(k)){
					k++;
				}
				count = count%MOD + k-j-1;
				count = count%MOD;
			}
		}
		return count;
    }

}
