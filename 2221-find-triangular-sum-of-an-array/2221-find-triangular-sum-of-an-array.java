class Solution {
    public int triangularSum(int[] nums)
     {
        for(int j=0;j<nums.length-1;j++)
        {
            for(int i=0;i<nums.length-1-j;i++)
            {
                nums[i]=(nums[i]+nums[i+1])%10;
            }
        }  
        return nums[0];     
        
    }
}