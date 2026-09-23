class Solution {
    public int minOperations(int[] nums, int x) 
    {
        int len=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }   
        int target=sum-x; 
        if(target<0)
        {
            return -1; 
        } 
        int left=0;
        int currsum=0;
        for(int right=0;right<nums.length;right++)
        {
            currsum+=nums[right];
           

            while(currsum>target)
            {
                
                currsum-=nums[left];
                left++;
            }
             if(currsum==target)
            len=Math.max(len,right-left+1);
            
        }
        return len==Integer.MIN_VALUE?-1:nums.length-len;
    }
}