class Solution {
    public boolean canJump(int[] nums) 
    {
        int current=nums[0];
        for(int i=1;i<nums.length;i++)
        {
             if(current==0)
            {
                return false;
            }

            current--;
            current=Math.max(current,nums[i]);
           
        }
        return true;
        
    }
}