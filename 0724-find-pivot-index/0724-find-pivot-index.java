class Solution {
    public int pivotIndex(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int left=0,x=0;
        while(left<nums.length)
        {
           
            if(x==sum-x-nums[left])
            {
                return left;
            }
             x+=nums[left];
            left++;
            
        }
        return -1;
        
    }
}