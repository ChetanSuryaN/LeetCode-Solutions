class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int left=0,right=0,sum=0;
        int len=Integer.MAX_VALUE;
        for( right=left;right<nums.length;right++)
        {
             sum+=nums[right];
            while(sum>=target)
            {
                 len=Math.min(len,right-left+1);
                sum-=nums[left];
                left++;
            }
            
        }
        return (len==Integer.MAX_VALUE)?0:len;
        
    }
}