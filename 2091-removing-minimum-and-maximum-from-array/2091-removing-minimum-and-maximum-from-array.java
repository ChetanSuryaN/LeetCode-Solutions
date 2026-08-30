class Solution {
    public int minimumDeletions(int[] nums) 
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minpos=-1;
        int maxpos=-1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
                minpos=i;
            }
            if(max<nums[i])
            {
                max=nums[i];
                maxpos=i;
            }
        }
        int front=Math.max(minpos,maxpos)+1;
        int behind=Math.max(nums.length-minpos,nums.length-maxpos);
        int both=Math.min(minpos,nums.length-1-minpos)+Math.min(maxpos,nums.length-1-maxpos)+2;
        return Math.min(front,Math.min(both,behind));
        
    }
}