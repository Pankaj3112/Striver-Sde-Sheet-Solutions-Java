class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(0,0,m,n, dp);
    }

    public int solve(int i, int j, int m, int n, int[][]dp){
        if(i<0 || j<0 || i>=n || j>=m){
            return 0;
        }

        if(i==n-1 && j==m-1){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        return dp[i][j] = solve(i+1, j, m, n, dp) + solve(i, j+1, m, n, dp);
    }
}