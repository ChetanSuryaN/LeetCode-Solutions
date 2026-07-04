class Solution {
    public int minOperations(int[] nums, int x) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
             sum+=nums[i];
        }
        if(sum<x)
        {
            return -1;
        }
        int left=0;
        int s=0;
        int len=Integer.MIN_VALUE;
        
        for(int right=left;right<nums.length;right++)
        {
            s+=nums[right];
            while(s>sum-x&&left<nums.length)
            {
               
                s-=nums[left];
                left++;
            }
             if(s==sum-x)
                {
                    len=Math.max(len,right-left);
                    
                }

        }
        return (len==Integer.MIN_VALUE)?-1:nums.length-len-1;
        
    }
}