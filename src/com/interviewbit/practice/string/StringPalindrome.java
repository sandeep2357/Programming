package com.interviewbit.practice.string;

public class StringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String A = "A man, a plan, a canal: Panama";
		String A = "race a car";
		System.out.println(isPalindrome(A));
	}
	
	public static int isPalindrome(String A) {
		 A = A.toLowerCase();
	        String temp = "";
	        int len = A.length();
	        if(len==0){
	            return 1;
	        }
	        int i,j;
	        i=0;
	        j=len-1;
	        while(i<=j){
	            while(i<len && !isAlphaNumeric(A.charAt(i))){
	                i++;
	            }
	            while(j>=0 && !isAlphaNumeric(A.charAt(j))){
	                j--;
	            }
	            if(i<len && j>=0 && A.charAt(i)!=A.charAt(j)){
	                return 0;
	            }
	            i++;
	            j--;
	        }
	        return 1;
	        // Time Limit Exceeded for this approach
	        /*for(i=0;i<len;i++){
	            if((A.charAt(i)>=97 && A.charAt(i)<=122) || (A.charAt(i)>=48 && A.charAt(i)<=57)){
	                temp = temp + A.charAt(i);
	            }
	        }
	        int tempLen = temp.length();
	        for(i=0;i<tempLen/2;i++){
	            if(temp.charAt(i)!=temp.charAt(tempLen-i-1)){
	                return 0;
	            }
	        }
	        return 1;*/
	    }
	    
	    public static boolean isAlphaNumeric(char A){
	        if((A>=97 && A<=122) || (A>=48 && A<=57)){
	                return true;
	        }
	        return false;
	    }

}
