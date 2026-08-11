class Solution {
    public int missingInteger(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int prefixsum=nums[0];
        int flag=-1;
       for(int i=1;i<nums.length;i++)
       {
           if(nums[i]-1==nums[i-1])
           {
            prefixsum+=nums[i];
           }
        else
        {
           break;
        }
        
       }
       while(set.contains(prefixsum))
       {
        prefixsum++;
       }
       return prefixsum;
    }
}