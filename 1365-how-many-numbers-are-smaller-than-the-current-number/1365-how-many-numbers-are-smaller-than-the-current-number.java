class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            map.put(arr[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=map.get(nums[i]);
        }
        return nums;
        
    }
}