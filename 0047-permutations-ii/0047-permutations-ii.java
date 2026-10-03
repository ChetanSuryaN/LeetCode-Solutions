class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        Arrays.sort(nums);
        helper(nums,new ArrayList<>(),new boolean[nums.length]);
        return ans; 
    }
    private void helper(int nums[],List<Integer> list,boolean v[])
    {
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if((i>0&&nums[i]==nums[i-1])&&!v[i-1]||v[i]) continue;
            
                v[i]=true;
                list.add(nums[i]);
                helper(nums,list,v);
                v[i]=false;
                list.remove(list.size()-1);
            
        }
    }
}