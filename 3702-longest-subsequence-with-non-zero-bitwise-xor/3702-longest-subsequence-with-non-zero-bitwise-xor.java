class Solution {
    public int longestSubsequence(int[] nums) 
    {
        int len=nums.length;
        int zero=0;
        int xor=0;

        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zero++;
            }
            xor^=nums[right];
        }
         if(xor!=0)
        return len;

        if(zero==len)
        {
            return 0;
        }
        return len-1;
        
    }
}