
class Solution {
    public int numTrees(int n)
    {
        long[] dp=new long[n+1];
        dp[0]=dp[1]=1;
        for(int m=2;m<=n;m++)
        {
            for(int j=1;j<=m;j++)
            {
                dp[m]+=dp[j-1]*dp[m-j];
            }
        }  
        return (int)dp[n];     
    }
}