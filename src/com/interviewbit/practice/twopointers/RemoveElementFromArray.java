package com.interviewbit.practice.twopointers;

import java.util.ArrayList;

public class RemoveElementFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(3);
		System.out.println(removeElement(a, 1));
		System.out.println(a);
	}
	
	public static int removeElement(ArrayList<Integer> a, int b) {
		/*int i=0;
		while(i<a.size()){
			if(a.get(i).equals(b)){
				a.remove(i);
			}else{
				i++;
			}
		}
		return a.size();*/
		int nextPtr=0;
		int i=0;
		while(i<a.size()){
			if(!a.get(i).equals(b)){
				a.set(nextPtr, a.get(i));
				nextPtr++;
			}
			i++;
		}
		a.subList(nextPtr,a.size()).clear();
		return nextPtr;
    }

}
