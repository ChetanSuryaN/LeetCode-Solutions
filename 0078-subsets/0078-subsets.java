class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) 
    {
        helper(nums,new ArrayList<>(),0);
        return ans;        
    }
    private void helper(int nums[],List<Integer> list,int idx)
    {
        ans.add(new ArrayList<>(list));
        if(list.size()==nums.length)
        {
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i])&&i>=idx)
            {
                list.add(nums[i]);
                helper(nums,list,i);
                list.remove(list.size()-1);
            }
        }
    }
}