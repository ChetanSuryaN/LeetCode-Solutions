class Solution 
{
    
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        helper(new ArrayList<>(),candidates,0,target);
        return ans;
    }
    private void helper(List<Integer> list,int arr[],int idx,int target )
    {
        if(target<0||idx==arr.length)
        {
            return ;
        }
        if(target==0)
        {
            if(!ans.contains(new ArrayList<>(list)))
            ans.add(new ArrayList<>(list));
            return ;
        }
    
        list.add(arr[idx]);

        helper(list,arr,idx,target-arr[idx]);
        helper(list,arr,idx+1,target-arr[idx]);
        list.remove(list.size()-1);
        helper(list,arr,idx+1,target);
    }
    
}