class Solution {
    public int distinctAverages(int[] nums)
     {
        HashSet<Double> set=new HashSet<>();
        Arrays.sort(nums);
        int left=0,ans=0;
        int right=nums.length-1;
        while(left<=right)
        {
            double avg=(nums[left]+nums[right])/2.0;
            if(!set.contains(avg))
            {
                ans++;

            }
            set.add(avg);
             left++;
        right--;
        }
        return ans;
       
    }
}