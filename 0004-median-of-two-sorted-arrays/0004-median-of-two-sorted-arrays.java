class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
     {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[n+m];
        for(int i=0;i<m+n;i++)
        {
            if(i<m)
            {
                arr[i]=nums1[i];
            }
            else
            {
                arr[i]=nums2[i-m];
            }
        }
        Arrays.sort(arr);
        int x=arr.length;
        double ans;
        if(x%2==0)
        {
           ans=(arr[x/2]+arr[x/2-1])/2.0;
        }
        else
        {
           ans= arr[x/2];
        }
        return ans;
        
    }
}