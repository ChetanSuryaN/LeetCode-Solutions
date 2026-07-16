class Solution {
    public List<List<Integer>> threeSum(int[] nums)
     {
        List<List<Integer>> list=new ArrayList<>();
       int left=0,right=nums.length-1;
       Arrays.sort(nums);      
       for(int i=0;i<nums.length;i++)
       {
        left=i+1;
        right=nums.length-1;
        if(i>0&&nums[i]==nums[i-1])
        {
            continue;
        }
       

         while(left<right)
         {
            if(nums[i]+nums[left]+nums[right]<0)
            {
                left++;
            }
            else if(nums[i]+nums[left]+nums[right]>0)
            {
                right--;
            }
            else
            {
                List<Integer> t=new ArrayList<>();
                t.add(nums[i]);
                t.add(nums[left]);
                t.add(nums[right]);
                list.add(t);
                left++;
                right--;

                 while(left<right&&nums[left]==nums[left-1])
        {
            left++;
        }
        while(left<right&&nums[right]==nums[right+1])
        {
            right--;
        }

            }
            
            
         }
       }
       return list;
        
    }
}