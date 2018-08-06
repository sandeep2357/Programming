package com.interviewbit.practice.twopointers;

import java.util.ArrayList;
import java.util.HashMap;

public class DifferencePossible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		/*a.add(1);
		a.add(3);
		a.add(5);*/
		/*a.add(1);
		a.add(4);
		a.add(4);
		a.add(6);
		a.add(9);*/
		a.add(0);
		
		System.out.println(diffPossible(a, 0));
	}
	
	public static int diffPossible(ArrayList<Integer> A, int B) {
		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = A.size();
        if(len<2){
            return 0;
        }
        int i=0;
        for(i=0;i<len;i++){
            map.put(A.get(i), i);
        }
        for(i=0;i<len;i++){
            if(map.containsKey(A.get(i)+B) && i!=map.get(A.get(i)+B)){
                return 1;
            }
        }
        return 0;*/
		int i=0,j=0;
		int len = A.size();
		while(j<len && i<len){
			if(i==j){
				j++;
			}else if(A.get(i)+B==A.get(j)){
				return 1;
			}else if(A.get(i)+B<A.get(j)){
				i++;
			}else if(A.get(i)+B>A.get(j)){
				j++;
			}
		}
		return 0;
    }

}
