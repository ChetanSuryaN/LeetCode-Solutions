class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        int arr[]=new int[nums.length];
        int k=nums.length-1;
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                 arr[k]=nums[left]*nums[left];
                 left++;
                 k--;
               
            }
            else if(Math.abs(nums[left])<=Math.abs(nums[right]))
            {
                arr[k]=nums[right]*nums[right];
                k--;
                right--;
            }
        
        }
        
        return arr;
        
    }
}