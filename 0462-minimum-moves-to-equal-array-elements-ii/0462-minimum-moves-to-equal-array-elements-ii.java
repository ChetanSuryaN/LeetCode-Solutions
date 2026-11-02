class Solution {
    public int minMoves2(int[] nums) 
    {
        /*
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        int target=sum/nums.length;
        int minsum=0;
        for(int num:nums)
        {
            minsum+=Math.abs(target-num);
        }
       if(target*nums.length!=sum)
        {
            target++;
            int min=0;
            for(int num:nums)
            {
            min+=Math.abs(target-num);
            }
            minsum = Math.min(minsum,min);
        }
        */

        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int minsum=0;
        for(int num:nums)
        {
            minsum+=Math.abs(mid-num);
        }

        
        return minsum;
        
    }
}