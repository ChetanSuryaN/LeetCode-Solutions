class Solution {
    public int maxSubArray(int[] nums) 
    {
        
        int sum=0;
        int min=0;
        int maxsum=Integer.MIN_VALUE;        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum-min);
            min=Math.min(min,sum);           
        }
        
        
      
        return maxsum;     
    }
}