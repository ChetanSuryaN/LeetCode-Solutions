class Solution {
    public int numberOfArithmeticSlices(int[] nums) 
    {
        int count=0;
        int continuous=0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]-nums[i+1]==nums[i+1]-nums[i+2])
            {
                continuous++;
                count+=continuous;
            }
            else
            {
                continuous=0;
            }
        }
        return count;
        
    }
}