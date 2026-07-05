class Solution {
    public int thirdMax(int[] nums) 
    {
        
        long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE,max3=Long.MIN_VALUE;
        int y=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max1||nums[i]==max2||nums[i]==max3)
            {
                continue;
            }
            if(nums[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1= (long)nums[i];
            }
            else if(nums[i]>max2&&nums[i]!=max1)
            {
                max3=max2;
                max2=(long)nums[i];
            }
            else if(nums[i]>max3&&nums[i]!=max2)
            {
                max3=(long)nums[i];
            }
        }
       if(max3==Long.MIN_VALUE)
       {
        y= (int) max1;
       }
        else
        {
       y= (int) max3;
        }
        return y;
        
    }
}