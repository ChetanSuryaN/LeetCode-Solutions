class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    { 
        
        HashSet<Integer> set=new HashSet<>();
        k=Math.min(k,nums.length);
        for(int i=0;i<k;i++)
        {
            
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
            set.remove(nums[i-k]);

        }
        return false;
        
    }
}