class Solution 
{
    int mindiff=Integer.MAX_VALUE;
    int ans=0;
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            helper(nums,i,target);
        }
        return ans;        
    }
    public void helper(int nums[],int position,int target)
    {
        int left=position+1;
        int right=nums.length-1;
        while(left<right)
        {
            int sum=nums[position]+nums[right]+nums[left];
            if(mindiff>Math.abs(target-sum))
            {
                mindiff=Math.abs(target-sum);
                ans=sum;
            }
            if(sum==target)
            {
                return ;
            }
            else if(sum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
    }
}