class Solution 
{
    int memo[];
    public int rob(int[] nums) 
    {
       int prev1=0;
       int prev2=0;
       for(int num:nums)
       {
        int curr=Math.max(prev1,prev2+num);
        prev2=prev1;
        prev1=curr;
       }       
       return prev1;
    }
    public int helper(int i,int nums[])
    {
        if(i>=nums.length)
        {
            return 0;
        }
        if(memo[i]!=-1)
        {
            return memo[i];
        }
        int count=helper(i+2,nums)+nums[i];
        int leftcount=helper(i+1,nums);

        memo[i]=Math.max(count,leftcount);
        return memo[i];
    }
}