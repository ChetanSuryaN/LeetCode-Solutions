class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int x:set)
        {
            
            int len=0;
            if(set.contains(x-1))
            {
                continue;
            }
            while(set.contains(x))
            {
                len++;
                x++;
            }
            ans=Math.max(ans,len);
        }
        return ans;
        
    }
}