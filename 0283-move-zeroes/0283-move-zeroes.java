class Solution {
    public void moveZeroes(int[] nums)
     {
        int j=0;
        int i;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        i=j;
        while(i<n)
        {
            nums[i]=0;
            i++;
        }

        
    }
}