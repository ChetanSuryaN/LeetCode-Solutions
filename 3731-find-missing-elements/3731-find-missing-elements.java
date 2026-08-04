class Solution {
    public List<Integer> findMissingElements(int[] nums)
     {
        int max=-1;
        int min=1000;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            max=Math.max(num,max);
            min=Math.min(num,min);
            set.add(num);
        }
        List<Integer> list=new ArrayList<>();
       for(int i=min;i<max;i++)
       {
        if(!set.contains(i))
        {
            list.add(i);
        }
       }
       return list;
        
    }
}