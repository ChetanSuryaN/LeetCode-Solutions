class Solution {
    public int jump(int[] nums) 
    {
        int end=0;
        int reach=0;
        int jump=0;
        for(int i=0;i<nums.length;i++)
        {
             if(end>nums.length-2)
            {
                break;
            }
            reach=Math.max(reach,i+nums[i]);
            if(i==end)
            {
                jump++;
                end=reach;
            }
           
        }
        return jump;
        
    }
}