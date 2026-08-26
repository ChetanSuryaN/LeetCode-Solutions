class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {      
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int []nums,int k)
    {
         int odd=0;
        int count=0;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]%2==1)
            {
                odd++;
            }
            while(odd>k)
            {              
                if(nums[left]%2==1)
                {
                    odd--;
                }
                left++;
            }
            count+=right-left+1;             
            
        }
       return count;
    }
}
