class Solution 
{
    int memo[];
    public int numSquares(int n) 
    {
        if(n==1) return 1;
        memo=new int[n+1];
        int x=(int)Math.sqrt(n);
        int nums[]=new int[x];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(i+1)*(i+1);
        }
        Arrays.fill(memo,-1);
        return helper(n,nums);        
    }
    private int helper(int n,int nums[])
    {
        if(n<0)
        {
            return Integer.MAX_VALUE;
        }
        if(n==0)
        {
            return 0;
        }
        if(memo[n]!=-1)
        {
            return memo[n];
        }
        int min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            int val=helper(n-i,nums);
            if(val!=Integer.MAX_VALUE)
            {
                min=Math.min(val+1,min);
            }
        }
        memo[n]=min;
        return memo[n];
    }
}