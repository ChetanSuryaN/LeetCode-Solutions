class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int j=-1;
        int[] ans=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            ans[++j]=nums[i];
            ans[++j]=nums[n+i];
        }
        return ans;

        
    }
}