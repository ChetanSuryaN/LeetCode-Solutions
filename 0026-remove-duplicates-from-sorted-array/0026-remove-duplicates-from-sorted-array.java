class Solution {
    public int removeDuplicates(int[] nums)
     {
         int i=0,j;
         int k=nums.length;
         if(k==0)
         {
            return 0;
         }
         else
         {
         for(j=1;j<k;j++)
         {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
                
            }
         }
         return i+1;
         }
    }
}