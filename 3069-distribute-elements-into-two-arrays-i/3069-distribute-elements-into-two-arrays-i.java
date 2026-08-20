class Solution {
    public int[] resultArray(int[] nums)
     {
        int arr[]=new int[nums.length];
        
        int left=-1;
        int right=nums.length;
        arr[++left]=nums[0];
        arr[--right]=nums[1];
       
        for(int i=2;i<nums.length;i++)
        {
            if(arr[left]>arr[right])
            {
                arr[++left]=nums[i];
            }
            else
            {
                arr[--right]=nums[i];
            }
        }
       int last=nums.length-1;
       while(right<last)
       {
        int temp=arr[right];
        arr[right]=arr[last];
        arr[last]=temp;
        right++;
        last--;
       }
        return arr;
        
    }
}