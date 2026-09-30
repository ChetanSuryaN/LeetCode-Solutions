class Solution 
{
    
        int memo[];
    public int rob(int[] nums) 
    {
        memo=new int[nums.length];
        if(nums.length==1)
        {
            return nums[0];
        }
        
        Arrays.fill(memo,-1);  
        int max1=helper(nums,1,nums.length);
        Arrays.fill(memo,-1);
        int max2=helper(nums,0,nums.length-1);
        return Math.max(max1,max2);
             

        
    }
    public int helper(int nums[],int i,int len)
    {
        if(i>=len)
        {
            return 0;
        }
        if(memo[i]!=-1)
        {
            return memo[i];
        }
        int count=helper(nums,i+2,len)+nums[i];
        int without=helper(nums,i+1,len);
        memo[i]=Math.max(count,without);
        return memo[i];
    }
}