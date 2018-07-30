package com.interviewbit.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>();
		/*A.add(2);
		A.add(4);
		A.add(6);*/
		// 96, 96, 7, 81, 2, 13
		A.add(96);
		A.add(96);
		A.add(7);
		A.add(81);
		A.add(2);
		A.add(13);
		//System.out.println(onesCount(5));
		System.out.println(hammingDistance(A));

	}
	public static int hammingDistance(final List<Integer> A) {
        int len = A.size();
        int res = 0;
        
        if(len == 0 ){
            return res;
        }
        int i,j,temp;
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                temp = A.get(i)^A.get(j);
                System.out.println(onesCount(temp));
                res = (res%1000000007 + onesCount(temp))%1000000007;
            }
        }
        
        return res;
    }
    
    public static int onesCount(int temp){
        int i=0;
        while(temp>0){
        	//System.out.println(temp>>1);
        	if((temp & 1) > 0){
        		i++;
        	}
            temp = temp >> 1;
        }
        return i;
    }

}
