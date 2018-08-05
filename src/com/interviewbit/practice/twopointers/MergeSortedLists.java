package com.interviewbit.practice.twopointers;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedLists {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(8);
		
		b.add(6);
		b.add(9);
		merge(a, b);
		System.out.println(a);
	}
	
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
//		int l1 = a.size();
//		int l2 = b.size();
//		int i=0,j=0;
//		for(i=l2-1;i>=0;i--) {
//			int last = a.get(l1-1);
//			for(j=l1-2;j>=0 && a.get(j)>b.get(i);j--) {
//				a.set(j+1, a.get(j));
//			}
//			if(j!=l1-2 || last > b.get(i)) {
//				a.set(j+1, b.get(i));
//				b.set(i,last);
//			}
//		}
//		for(i=0;i<l2;i++) {
//			a.add(b.get(i));
//		}
		
		int i = 0;
	    int j = 0;
	    while (i < a.size() && j < b.size()) {
	        if (a.get(i) <= b.get(j)) {
	            i++;
	        } else {
	            a.add(i, b.get(j));
	            j++;
	        }
	    }
	    while (j < b.size()) {
	       a.add(i, b.get(j));
	       j++;
	    }
    }

}
