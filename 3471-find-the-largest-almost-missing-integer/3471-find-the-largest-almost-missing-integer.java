class Solution {
    public int largestInteger(int[] nums, int k) 
    {
        int max=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
           map.put(num,map.getOrDefault(num,0)+1);
           max=Math.max(max,num);
        }    
        if(k==1)
        {
            int curr=-1;
            for(int num:nums)
            {
                if(map.get(num)==1&&curr<num)
                curr=num;                
            }
            return curr;
        }
        if(k==nums.length)
        {
            return max;
        }
        else
        {
            if(map.get(nums[nums.length-1])==1&&map.get(nums[0])==1)
            return Math.max(nums[nums.length-1],nums[0]);
            else if(map.get(nums[nums.length-1])==1)
            return nums[nums.length-1];
            else if(map.get(nums[0])==1)
            return nums[0];
        }
        return  -1;
    }
}