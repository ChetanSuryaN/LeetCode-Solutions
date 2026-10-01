class Solution {
    public int maxSubArray(int[] nums) 
    {
        int prefix[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            prefix[i]=sum;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        int maxsum=sum;
        int min=0;
        for(int i=0;i<nums.length;i++)
        {
            maxsum=Math.max(prefix[i]-min,maxsum);
            min=Math.min(min,prefix[i]);
        }   
        return maxsum;     
    }
}