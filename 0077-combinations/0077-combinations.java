class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) 
    {
        helper(new ArrayList<>(),n,1,k);
        return ans;
    }
    private void helper(List<Integer> list,int n,int idx,int k)
    {
        if(list.size()==k)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx;i<=n;i++)
        {
            if(!list.contains(i))
            {
                list.add(i);
                helper(list,n,i+1,k);
                list.remove(list.size()-1);
            }
        }
    }
    
}