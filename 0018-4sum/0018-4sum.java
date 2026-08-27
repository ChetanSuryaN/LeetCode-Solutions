class Solution 
{
    List<List<Integer>> ans;
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        ans=new ArrayList<>();
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                builder(i,j,nums,target);
            }
        }
        ans=new ArrayList(new HashSet<>(ans));
        return ans;      
    }
    public void builder(int left,int right,int nums[],int target)
    {
        int priorsum=nums[left]+nums[right];       
        int lefty=right+1;
        int righty=nums.length-1;
        while(lefty<righty)
        {
            long sum=(long)nums[lefty]+nums[righty]+priorsum;
            if(sum==(long)target)
            {
                ans.add(Arrays.asList(nums[left],nums[right],nums[lefty],nums[righty]));
                lefty++;
                righty--;
            }
            else if(sum>(long)target)
            {
                righty--;
            }
            else
            {
                lefty++;
            }
        }
        return ;
    }
}