class Solution {
    public int firstStableIndex(int[] nums, int k) 
    {       
        int minelement=nums[nums.length-1];
        int []min=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            minelement=Math.min(nums[i],minelement);
            min[i]=minelement;
        }
        int max=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
            
                if(max-min[i]<=k)
                {
            return i;
                }
           
        }
        return -1;
         
    }
}