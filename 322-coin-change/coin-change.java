class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        /*
        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++)
        {
            for(int j=coins[i];j<dp.length;j++)
            {
                if(dp[j-coins[i]]!=Integer.MAX_VALUE)
                {
                    dp[j]=Math.min(dp[j-coins[i]]+1,dp[j]);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE)
        {
            return -1;
        }
        return dp[amount];
        */
        int[][] dp=new int[n+1][amount+1];
        for(int i=1;i<=amount;i++)
        {
            dp[0][i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                if(j<coins[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }
                else if(j==coins[i-1])
                {
                    dp[i][j]=1;
                }
                else
                {
                    int take=dp[i][j-coins[i-1]];
                    if (take != Integer.MAX_VALUE) {
                        take = take + 1;
                    }
                    dp[i][j]=Math.min(take,dp[i-1][j]);
                }
            }
        }
        
        return dp[n][amount]==Integer.MAX_VALUE?-1:dp[n][amount];

    }
}   