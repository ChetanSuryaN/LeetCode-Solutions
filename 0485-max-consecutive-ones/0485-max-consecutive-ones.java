class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                current++;
            }
            else
            {
                current=0;
            }
            max=Math.max(max,current);
        }
        return max;
        
    }
}