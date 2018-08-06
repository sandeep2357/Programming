package com.interviewbit.practice.twopointers;

import java.util.ArrayList;

public class RemoveDuplicatesSortedArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(2);
		System.out.println(removeDuplicates(a));
		System.out.println(a);
	}
	public static int removeDuplicates(ArrayList<Integer> a) {
		//int len = a.size();
		/*int i=1;
		int count = 1;
        while(i<a.size()) {
        	if(count < 2 && a.get(i).intValue()==a.get(i-1).intValue()){
        		count++;
        		i++;
        	}
            if(count >= 2 && a.get(i).intValue()==a.get(i-1).intValue()) {
                a.remove(i);
                count++;
            }else if(count > 2 && a.get(i).intValue()!=a.get(i-1).intValue()){
            	count = 1;
                i++;
            }
        }
        return a.size();*/
        int i=1;
		int idx = 1;
		int count = 1;
		while(i<a.size()) {
			if(a.get(i).intValue()==a.get(i-1).intValue() && count < 2) {
				while(i<a.size() && a.get(i).intValue()==a.get(i-1).intValue()) {
					i++;
					count++;
				}
				a.set(idx++, a.get(i));
			}else {
				a.set(idx, a.get(i));
				idx++;
				i++;
				count=1;
			}
		}
		
		return idx;
	}

}
