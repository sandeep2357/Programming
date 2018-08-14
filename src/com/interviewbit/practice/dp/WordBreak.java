package com.interviewbit.practice.dp;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "Tringmymy";
		ArrayList<String> B= new ArrayList<String>();
		B.add("my");
		B.add("Trin");
		B.add("g");
		System.out.println(wordBreak(A,B));

	}
	
	public static int wordBreak(String A, ArrayList<String> B) {
		/*int len = A.length();
		int[][] dp = new int[len][len];
		int i,j;
		for(i=0;i<len;i++){
			for(j=0;j<len;j++){
				dp[i][j]=0;
			}
		}
		for(i=0;i<len;i++){
			for(j=i;j<len;j++){
				String s = A.substring(i, j+1);
				if(B.contains(s)){
					dp[i][j]=1;
					dp[j][i]=1;
				}else{
					dp[i][j]=0;
					dp[j][i]=0;
				}
			}
		}
		
		for(i=0;i<len;i++){
			for(j=0;j<len;j++){
				System.out.print(dp[i][j]+ " ");
			}
			System.out.println();
		}
		
		return checkWordBreak(A,0,0,dp);*/
		
		//Method 2
		/*boolean[] f = new boolean[A.length() + 1];
        
        f[0] = true;
		for(int i=1; i <= A.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && B.contains(A.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        if(f[A.length()]){
        	return 1;
        }else{
        	return 0;
        }*/
        
        int len = A.length();
        boolean[] dp = new boolean[len];
        boolean[][] flag = new boolean[len][len];
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(determine(i,j,B,A))
                {
                    flag[i][j] = true;
                    
                }
                
            }
        }
        
        // for(int i=0;i<len;i++)
        //     for(int j=0;j<len;j++)
        //         System.out.println(i+","+j+" "+flag[i][j]);
        for(int i=0;i<len;i++){
            if(flag[0][i])
                dp[i]=true;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(dp[j]==true && flag[j+1][i]==true)
                    dp[i]=true;
            }
        }
        
        return dp[len-1]?1:0;
    }
	
	public static boolean determine(int start,int end,List<String> list,String s){
        String find = s.substring(start,end+1);
        return list.contains(find);
    }
	
	public static int checkWordBreak(String A, int i,int j, int[][] dp){
		if(i>=A.length()||j>=A.length()){
			return 1;
		}
		if(dp[i][j]==1){
			return 1;
		}
		int k,len=A.length();
		for(k=i;k<len;k++){
			if(dp[i][k]==1 && checkWordBreak(A, k+1,k+1, dp)>0){
				return 1;
			}
		}
		return 0;
	}

}
