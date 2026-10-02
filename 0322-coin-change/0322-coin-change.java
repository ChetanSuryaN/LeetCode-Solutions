class Solution 
{
    int memo[];
    public int coinChange(int[] coins, int amount) 
    {       
     memo=new int[10001];
     Arrays.fill(memo,-2);
     int ans=helper(coins,amount);
     if(ans==Integer.MAX_VALUE)
     {
        return -1;
     }
     return ans;
    }
    public int helper(int coins[],int amount)
    {
        if(amount<0)
        {
            return Integer.MAX_VALUE;
        }
        if(amount==0)
        {
            return 0;
        }
        if(memo[amount]!=-2)
        {
            return memo[amount];
        }
        int mincoins=Integer.MAX_VALUE;
        for(int num:coins)
        {
           int val=helper(coins,amount-num);
            if(val!=Integer.MAX_VALUE)
            {
                mincoins=Math.min(val+1,mincoins);
            }
        }
                  
        memo[amount]=mincoins;
        
        return memo[amount];
    }

}