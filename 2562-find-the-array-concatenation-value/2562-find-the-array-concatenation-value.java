class Solution {
    public long findTheArrayConcVal(int[] nums) 
    {
        int left=0,right=nums.length-1;
        long sum=0;
        while(left<=right)
        {
             if(left==right)
            {
                sum+=nums[left];
            }
            else
            {
            String str=String.valueOf(nums[left])+String.valueOf(nums[right]);
            sum+=Integer.valueOf(str);
            }
           
            left++;
            right--;
        }
        return sum;


        
    }
}