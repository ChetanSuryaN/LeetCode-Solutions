class Solution {
    public int maxEqualAdjacentPairs(int[] nums) 
    {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap();
        int found=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                found++;
            }
            else
            {
                int v=Math.min(nums[i],nums[i+1]);
                int u=Math.max(nums[i],nums[i+1]);
                HashMap<Integer,Integer> temp=map.getOrDefault(u,new HashMap<>());
                temp.put(v,temp.getOrDefault(v,0)+1);
                max=Math.max(max,temp.get(v));
                map.put(u,temp);
            }
        }
        return max+found;
        
        
        
    }
}