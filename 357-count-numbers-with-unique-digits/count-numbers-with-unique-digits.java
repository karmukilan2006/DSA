class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
        {
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
      
        dp[1]=10;
        int ava=9;
        int unique=9;
        for(int i=2;i<=n;i++)
        {
            unique=unique*ava;
            dp[i]=dp[i-1]+unique;
            ava--;

        }
        return dp[n];
    }
}