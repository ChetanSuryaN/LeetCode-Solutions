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
        
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
    
        
       for(int i=idx;i<arr.length;i++)
       {
        if(arr[i]<=target)
        {
        list.add(arr[i]);
        helper(list,arr,i,target-arr[i]);
        list.remove(list.size()-1);
        }
       }
       
    }
    
}