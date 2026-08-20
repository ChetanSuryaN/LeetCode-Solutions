class Solution {
    public int[] resultArray(int[] nums)
     {
        int arr[]=new int[nums.length];
        int m[]=new int[nums.length];
        int top=-1;
        int bigtop=-1;
        arr[0]=nums[0];
        m[0]=nums[1];
        top=0;
        bigtop=0;
        for(int i=2;i<nums.length;i++)
        {
            if(arr[top]>m[bigtop])
            {
                arr[++top]=nums[i];
            }
            else
            {
                m[++bigtop]=nums[i];
            }
        }
        for(int i=0;i<=bigtop;i++)
        {
            arr[++top]=m[i];
        }
        return arr;
        
    }
}