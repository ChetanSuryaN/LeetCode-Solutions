class Solution {
    public int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        int i,n,k=0,ans=0;
        n=nums.length;
        ans=n/2;
        return nums[ans];
        
    }
}