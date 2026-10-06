class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        helper(1,n,10,new ArrayList<>(),k);
        return ans;
    }
    private void helper(int start,int target,int end,List<Integer> list,int k)
    {
        if(target==0&&list.size()==k)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=start;i<end;i++)
        {
            if(i<=target)
            {
                if(!list.contains(i))
                {
                    list.add(i);
                    helper(i+1,target-i,end,list,k);
                    list.remove(list.size()-1);
                }
            }
        }
    }
    
}