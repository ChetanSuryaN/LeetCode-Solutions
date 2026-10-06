class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<>());
        return ans;        
    }
    private void helper(int arr[],int target,int idx,List<Integer> list)
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
               if(i>idx&&arr[i]==arr[i-1])continue;
                    
                    list.add(arr[i]);
                    helper(arr,target-arr[i],i+1,list);
                    list.remove(list.size()-1);
                    
                
            }
        }     
    }
}