class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                sum+=1;
            }
            else
            {
                sum-=1;
            }
            if(sum==0)
            {
                len=Math.max(i+1,len);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            else
            {
                len=Math.max(len,i-map.get(sum));
            }
        }
        return len;
        
    }
}