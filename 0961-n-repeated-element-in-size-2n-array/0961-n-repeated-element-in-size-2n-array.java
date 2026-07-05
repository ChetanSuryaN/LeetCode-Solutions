class Solution {
    public int repeatedNTimes(int[] nums)
     {
        Arrays.sort(nums);
        int n=nums.length;
        int i;
        for(i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return nums[i];
            }
        }
        return 0;
        
    }
}