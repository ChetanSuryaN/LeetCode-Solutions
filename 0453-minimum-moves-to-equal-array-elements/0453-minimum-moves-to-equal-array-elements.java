class Solution {
    public int minMoves(int[] nums) 
    {
        int min=nums[0];
        for(int num:nums)
        {
            min=Math.min(num,min);
        }
        long ans=0;
        for(int  num:nums)
        {
            ans+=num-min;
        }
        return (int) ans;
        
    }
}