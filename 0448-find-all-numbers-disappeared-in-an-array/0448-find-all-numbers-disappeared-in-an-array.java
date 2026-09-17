class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> list=new ArrayList<>();
       Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for(int i=1;i<nums.length+1;i++)
        {
            if(!set.contains(i))
            list.add(i);
        }
        return list;
        
    }
}