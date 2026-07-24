class Solution {
    public int triangleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int ans=0;
        
        for(int i=nums.length-1;i>=2;i--)
        {
            int right=i-1;
        int left=0;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(sum>nums[i])
            {
                ans+=right-left;
                right--;
            }
            else
            {
                left++;
            }
        }
       

        }
         return ans;
        
        
        
    }
}