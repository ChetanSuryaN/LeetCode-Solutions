class Solution {
    public int[] applyOperations(int[] nums)
     {
       
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums.length-1&&nums[i]==nums[i+1])
            {
                nums[i]+=nums[i];
                nums[i+1]=0;
            }
            
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[++j]=nums[i];
            }
        }
        for(int i=j+1;i<nums.length;i++)
        {
            nums[i]=0;
        }
        return nums;
        
    }
}