class Solution {
    
    public int climbStairs(int n) {
        
        //code same as fibonacci series only change in line 9 -> as dp[0] = 1 as 0 means 1 way
//         int[] dp = new int[n+1];
        
// 		dp[0] = 1;
//         dp[1] = 1;
        
//         for(int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }
        
//         return dp[n];
        
        //Space optimized O(1)
        
        int prev1 = 1;
        int prev2 = 1;
        int curr = 2;
        
        
        
        for(int i = 2; i <= n; i++) {
            prev2 = prev1;
            prev1 = curr;
            curr = prev1 + prev2;
        }
        
        return prev1;
        
    }
    
}