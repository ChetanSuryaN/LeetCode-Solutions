class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) 
    {
        int left=0;
        List<List<Integer>> list=new ArrayList<>();
       Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<lower||nums[i]>upper)
                {
                }
                else
                {
                    if(nums[i]>lower)
                    {
                        list.add(List.of(lower, nums[i]-1));
                        
                    }
                   lower=nums[i]+1;
                }
            }
        if(lower<=upper)
        {
            list.add(List.of(lower, upper));
        }
        return list;
        
    }
}