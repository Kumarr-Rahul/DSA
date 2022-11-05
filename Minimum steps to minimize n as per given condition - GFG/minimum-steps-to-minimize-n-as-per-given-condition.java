//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minSteps(n));
                    
                }
        }
}    
// } Driver Code Ends


class Solution{
    
    public int memo(int N, int[] dp) {
        
        if(N == 1) {
	        return 0;
	    }
	    
	    if(dp[N] != -1) return dp[N];
	    
	    int ans1 = Integer.MAX_VALUE;
	    int ans2 = Integer.MAX_VALUE;
	    int ans3 = Integer.MAX_VALUE;
	    
	    
	    
	    if(N%2 == 0) {
	        ans1 = memo(N/2,dp);
	    }
	    
	    if(N%3 == 0) {
	        ans2 = memo(N/3, dp);
	    } 
        
        ans3 = memo(N - 1, dp);
    
	    int x = Math.min(ans1, ans2);
	    
	    dp[N] = Math.min(ans3, x) + 1;
	    
	    return dp[N]; 
    }

	public int minSteps(int N) 
	{ 
	    // Your code goes here
	    int[] dp = new int[N + 1];
	    Arrays.fill(dp, - 1);
	    
	    return memo(N, dp);
	    
	} 
}
