class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();  
    public List<List<Integer>> permute(int[] nums) 
    {  
        helper(new ArrayList<>(),nums);    
     return ans;   
    }
    public void helper(List<Integer> list,int nums[])
    {
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]))
            {
                list.add(nums[i]);
                helper(list,nums);
                list.remove(list.size()-1);
            }
        }
    }
}