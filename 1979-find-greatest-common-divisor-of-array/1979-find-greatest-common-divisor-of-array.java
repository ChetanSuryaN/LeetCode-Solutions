class Solution {
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        int a =nums[0];
        int b=nums[nums.length-1];
        int r=a%b;
        while(r>0)
        {
         a=b;
        b=r;
        r=a%b;
        }
        return b;
         
        
    }
}