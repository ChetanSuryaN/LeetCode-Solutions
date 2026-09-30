class Solution 
{
    int memo[];
    public int rob(int[] nums) 
    {
        memo=new int[nums.length];
        Arrays.fill(memo,-1);
        return helper(0,nums);        
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