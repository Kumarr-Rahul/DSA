//memo
// class Solution {
//     public int fib(int n, int[] dp) {
        
        
// 		if (n <= 1) return n;
        
//         if(dp[n] != -1) return dp[n];
        
//         dp[n] = fib(n - 1,dp) + fib(n - 2,dp);
        
// 		return dp[n];

//     }
    
//     public int fib(int n) {
     
//         int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
        
//         return fib(n, dp);
//     }    
// }


//Tabulation
class Solution {
    public int fib(int n) {
        
        if(n == 0) return 0;
        
        int[] dp = new int[n+1];
        
		dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];

    }   
}