//Memo
// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
//         int[] dp = new int [cost.length + 1];
//         // int max = Integer.MAX_VALUE;
//         Arrays.fill(dp, -1);
        
//         int ans = 0;
       
//         int minAns1 = memo(cost, dp, 0);
//         int minAns2 = memo(cost, dp, 1);
        
//         ans = Math.min(minAns1, minAns2);
//         return ans;
//     }
    
//     public int memo(int[] cost, int[] dp, int stair) {
        
//         if(stair == cost.length) {
//             return 0;
//         }
        
//         if(stair > cost.length) {
//             return Integer.MAX_VALUE;
//         }
        
//         if(dp[stair] != -1) return dp[stair];
            
//         int minCost1 = memo(cost, dp, stair + 1);
//         int minCost2 = memo(cost, dp, stair + 2);
        
//         int finalCost = Math.min(minCost1, minCost2) + cost[stair];
        
//         dp[stair] = finalCost;
        
//         return finalCost;
//     }
// }


//Tabulation 

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int [cost.length + 2];
        // int max = Integer.MAX_VALUE;
        Arrays.fill(dp, -1);
        
        int ans = table(cost, dp, 0);
        
        return ans;
    }
    
    public int table(int[] cost, int[] dp, int stair) {
        
        dp[cost.length] = 0;
        dp[cost.length + 1] = 0; //To avoid out of index error in line 68 when called by (cost.length - 1) index
        
        for(int i = cost.length - 1; i >= 0; i--) {
            
            int minCost1 = dp[i + 1];
            int minCost2 = dp[i + 2];
        
            dp[i] = Math.min(minCost1, minCost2) + cost[i];
            
        }
        
        return Math.min(dp[0],dp[1]);
    }
}
