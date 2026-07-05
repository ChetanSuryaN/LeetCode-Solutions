class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        Arrays.sort(nums);
        int x=0;
        int arr[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
            set.add(nums[i]);
            if(nums[i]==nums[i+1])
            {
                arr[0]=nums[i];
            }
        }
        set.add(nums[nums.length-1]);
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                arr[1]=i;
            }
        }
        return arr;
        
    }
}