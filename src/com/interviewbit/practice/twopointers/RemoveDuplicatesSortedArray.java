package com.interviewbit.practice.twopointers;

import java.util.ArrayList;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(2);
		System.out.println(removeDuplicates(a));
		System.out.println(a);
	}
	
	public static int removeDuplicates(ArrayList<Integer> a) {
		int i=1;
		int idx = 1; 
		while(i<a.size()) {
			if(a.get(i).intValue()==a.get(i-1).intValue()) {
				while(i<a.size() && a.get(i).intValue()==a.get(i-1).intValue()) {
					i++;
				}
			}else {
				a.set(idx, a.get(i));
				idx++;
				i++;
			}
		}
		
		return idx;
    }

}
