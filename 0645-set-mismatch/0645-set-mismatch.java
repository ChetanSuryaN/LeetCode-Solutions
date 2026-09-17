class Solution {
    public int[] findErrorNums(int[] nums) 
    {       
        for(int i=0;i<nums.length;i++)
        {
            nums[Math.abs(nums[i])-1]*=-1;
        }   
        int ans[]=new int[2];
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans[++j]=i+1;
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])==ans[0])
            {
                return ans;
            }
        }
        int emp=ans[0];
        ans[0]=ans[1];
        ans[1]=emp;
        return ans;
    }
}