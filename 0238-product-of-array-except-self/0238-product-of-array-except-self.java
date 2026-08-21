class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
       int right[]=new int[nums.length];
       int left[]=new int[nums.length];

       int leftp=1;
       for(int i=0;i<nums.length;i++)
       {
        left[i]=leftp;
        leftp*=nums[i];
       }
       int rightp=1;
       for(int i=nums.length-1;i>=0;i--)
       {
        right[i]=rightp;
        rightp*=nums[i];
       }

       for(int i=0;i<nums.length;i++)
       {
        left[i]*=right[i];
       }
       return left;

    }
}