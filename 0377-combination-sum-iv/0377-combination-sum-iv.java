class Solution 
{
    int memo[];
    int ans=0;
    public int combinationSum4(int[] nums, int target) 
    {
        memo=new int[target+1];
        
            Arrays.fill(memo,-1);
            memo[0]=1;
        
       return helper(nums,target);
       
        
    }
     private int helper(int nums[],int target)
     {
        
        if(target==0)
        {
            return 1;
        }
        if(memo[target]!=-1)
        {
            return memo[target];
        }
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target>=nums[i])
            res+=helper(nums,target-nums[i]);
        }
        memo[target]=res;
        return memo[target];
     }
}