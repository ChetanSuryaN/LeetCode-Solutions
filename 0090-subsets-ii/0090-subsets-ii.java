class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        helper(nums,new ArrayList<>(),new boolean[nums.length],0);
        return ans;        
    }
    private void helper(int nums[],List<Integer> list,boolean v[],int idx)
    {
        ans.add(new ArrayList<>(list));
        if(list.size()==nums.length)
        {
            return ;
        }
        for(int i=idx;i<nums.length;i++)
        {
           
            if((i>0&&nums[i]==nums[i-1])&&!v[i-1]||v[i]) continue;
            v[i]=true;
            list.add(nums[i]);
            helper(nums,list,v,i);
            list.remove(list.size()-1);
            v[i]=false;
            
        }
    }
}