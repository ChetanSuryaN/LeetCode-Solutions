class Solution 
{
    int memo[][];
    public int change(int amount, int[] coins) 
    {
        int n =coins.length;
        memo=new int[n][amount+1];
        for(int row[]:memo)
        Arrays.fill(row,-1);   
        Arrays.sort(coins);
        return helper(amount,coins,0);     
    }
    public int helper(int amount,int coins[],int i)
    {
        if( i>=coins.length)
        {
            return 0;
        }
        if(amount<0)
        {
            return 0;
        }
        if(amount==0)
        {
            return 1;
        }
        if(memo[i][amount]!=-1)
        {
            return memo[i][amount];
        }
        int ans=0;
        ans=helper(amount,coins,i+1)+helper(amount-coins[i],coins,i);
        memo[i][amount]=ans;
        return memo[i][amount];
    }
}