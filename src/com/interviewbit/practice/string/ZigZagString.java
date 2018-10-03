package com.interviewbit.practice.string;

public class ZigZagString {

	/**
	 * @param args
	 */
	public static String convert(String A, int B) {
	        String res="";
	        int strLen = A.length();
	        int l,k;
	        for(l=0;l<B;l++){
	            k = l;
	            int temp;
	            while(k<strLen){
	            	temp = k;
	                if(l!=B-1){
	                	res = res + A.charAt(k);
	                    temp = k;
	                    k = k + 2*(B-l)-2;
	                    if(temp==k){
	                    	break;
	                    }
	                }
	                if(k<strLen && l!=0){
	                    res = res + A.charAt(k);
	                    temp = k;
	                    k = k + 2*(l+1)-2;
	                    if(temp==k){
	                    	break;
	                    }
	                }
	                if(temp == k){
	                	res = res + A.charAt(k++);
	                }
	                System.out.println(k);
	            }
	            
	        }
	        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "cricket";
		System.out.println(convert(A,4));
	}

}
