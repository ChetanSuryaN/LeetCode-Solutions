class Solution 
{
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    public int countSpecialIntegers(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==null)
            {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
            else
            {
                List<Integer> list=new ArrayList<>();
                list=map.get(nums[i]);
                list.add(i);
                map.put(nums[i],list);
            }
        }
        
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                if(isSpecial(nums[i]))
                {
                    ans++;
                }
            }
            set.add(nums[i]);
        }
        return ans;
    }
    public boolean isSpecial(int x)
    {
        int occ=0;
        List<Integer> list=new ArrayList<>();
        list=map.get(x);
        if(list.size()<3)
        {
            return false;
        }
        for(int i=0;i<list.size()-2;i++)
        {
            if(Math.abs(list.get(i)-list.get(i+1))!=Math.abs(list.get(i+1)-list.get(i+2)))
            return false;
        }
        return true;
        
        
    }
}