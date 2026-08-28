class Solution {
    public void nextPermutation(int[] nums) 
    {
        int position=nums.length-2;
        while(position>=0)
        {
        if(nums[position]<nums[position+1])
        {
            swap(nums,position);
            return ;
        }
        position--;
        }
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }
       
    }
    public void swap(int []nums,int position)
    {
        int value=nums[position];
        for(int right=nums.length-1;right>position;right--)
        {
            if(nums[right]>nums[position])
            {
                int temp=nums[position];
                nums[position]=nums[right];
                nums[right]=temp;
                break;
            }

        }
         int left=position+1;
        int right=nums.length-1;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        
    }
}