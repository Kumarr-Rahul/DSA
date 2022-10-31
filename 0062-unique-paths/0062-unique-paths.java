class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m+1][n+1];
        
        int ans = paths(0, 0, m, n, dp);
        return ans;
    }
    
    public int paths(int srcRow, int srcCol, int m, int n, int [][] dp) {
        
        //negative base case
        if(srcCol >= n || srcRow >= m ) {
            return 0;
        }
        
        //positive base case
        if(srcRow == m - 1 && srcCol == n - 1) {
            return 1;
        }
        if(dp[srcRow][srcCol] != 0) return dp[srcRow][srcCol];
        //Right call
        int countR =  paths(srcRow, srcCol + 1, m, n, dp);
        
        //Down call
        int countD =  paths(srcRow + 1, srcCol, m, n, dp);
        
        dp[srcRow][srcCol] = countR + countD;

        return countR + countD;
    }
}